package com.jk.controller;

import com.alibaba.fastjson.JSONObject;
import com.jk.entity.OrderGoods;
import com.jk.service.DelMoneyService;
import com.jk.service.DelNumService;
import com.jk.service.WebLogService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Component
@RabbitListener(queues ="xm-queue")
public class WebLogRecevie {

    @Resource
    private WebLogService webLogService;
    @Resource
    private DelNumService delNumService;
    @Resource
    private DelMoneyService delMoneyService;
    @RabbitHandler
    public void WebLogRecevie(String logJson) {
            OrderGoods orderGoods = JSONObject.parseObject(logJson, OrderGoods.class);
                orderGoods.setOrderStatus(2);
                SimpleDateFormat smp = new SimpleDateFormat();
                orderGoods.setPaymentTime(smp.format(new Date()));
                double v = Math.floor(Math.random() * 9000000 + 1000000);
                int aa=(int) v;
                String name = String.valueOf(aa);
                orderGoods.setSerialNumber(name);
                webLogService.insertOrderGoods(orderGoods);
                String goodsId=orderGoods.getGoodsId();
                String goodsNum=orderGoods.getGoodsNum();
                Integer userId=orderGoods.getUserId();
                BigDecimal orderSumPrice=orderGoods.getOrderSumPrice();
                delNumService.delNum(goodsId,goodsNum);
                delMoneyService.delMoney(userId,orderSumPrice);
        System.out.println(orderGoods);
    }

}
