package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jump")
public class jumpcontroller {

    //跳转登录页面
    @RequestMapping("mi")
    public String mi(){
        return "mi";
    }
    //跳转首页页面
    @RequestMapping("/xm")
    public String guan(){
        return "main_page";
    }
    //跳转树页面index
    @RequestMapping("index")
    public String index(){
        return "index";
    }


    //跳转订单页面
    @RequestMapping("/goodsPhone")
    public String goodsPhone(){
        return "admin/goods_phones";
    }





}
