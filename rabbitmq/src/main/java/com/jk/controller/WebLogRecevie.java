package com.jk.controller;

import com.alibaba.fastjson.JSONObject;
import com.jk.entity.OrderGoods;
import com.jk.service.WebLogService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@RabbitListener(queues ="order-queue")
public class WebLogRecevie {

    @Resource
    private WebLogService webLogService;
    @RabbitHandler
    public void WebLogRecevie(String logJson) {
            OrderGoods orderGoods = JSONObject.parseObject(logJson, OrderGoods.class);
               orderGoods.setOrderStatus(2);
                webLogService.insertOrderGoods(orderGoods);
                webLogService.delNum(orderGoods.getGoodsId(),orderGoods.getGoodsNum());
                webLogService.delMoney(orderGoods.getUserId(),orderGoods.getOrderSumPrice());
        System.out.println(orderGoods);
    }



}
