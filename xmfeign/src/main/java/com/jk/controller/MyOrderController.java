package com.jk.controller;

import com.jk.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyOrderController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/myorder")
    public String  myorder(){

        return  "admin/order_admin";
    }

}
