package com.jk.controller;

import com.jk.entity.OrderGoods;
import com.jk.entity.xmuser;
import com.jk.pojo.RedisConstant;
import com.jk.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
public class OrderGoodsController {

    @Autowired
    private RedisUtil redisUtil;


    //订单生成存储redis
    @RequestMapping("/orderByInfo")
    @ResponseBody
    public void findOrderGoods(OrderGoods orderGoods, HttpSession session) {
        xmuser user = (xmuser) session.getAttribute("user");
        SimpleDateFormat smp = new SimpleDateFormat();
        orderGoods.setCreateTime(smp.format(new Date()));
        orderGoods.setUserId(user.getUserId());
        orderGoods.setOrderStatus(1);
        redisUtil.set(RedisConstant.Goods_Order__Key + "__" + orderGoods.getOrderNum(), orderGoods, 1000);

    }


    //跳转到订单提交成功页面
    @RequestMapping("/orderSuccess")
    public String orderSuccesss() {

        return "admin/order_success";
    }

    @RequestMapping("/findorderSuccess")
    @ResponseBody
    public OrderGoods order_admin(OrderGoods orderGoods) {
        OrderGoods orderGoods1 = (OrderGoods) redisUtil.get(RedisConstant.Goods_Order__Key + "__" + orderGoods.getOrderNum());
        System.out.println(orderGoods1);
        return orderGoods1;
    }


}
