package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jump")
public class JumpController {

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
    //跳转树页面index
    @RequestMapping("index1")
    public String index1(){
        return "index1";
    }


    //跳转订单页面
    @RequestMapping("/goodsPhone")
    public String goodsPhone(){
        return "admin/goods_phones";
    }

    @RequestMapping("main")
    public String main(){
        return "main_page";
    }
    @RequestMapping("test")
    public String test(){
        return "higCharts";
    }
    /*于英彬(个人中心)始*/
    //跳转个人中心页面center
    @RequestMapping("center")
    public String center(){
        return "yyb/center";
    }
    //跳转消息通知页面personal
    @RequestMapping("personal")
    public String personal(){
        return "yyb/personal";
    }
    //跳转购买资格页面shuttle
    @RequestMapping("shuttle")
    public String shuttle(){
        return "yyb/shuttle";
    }
    //跳转现金账户页面current
    @RequestMapping("current")
    public String current(){
        return "yyb/current";
    }
    //跳转小米礼品卡页面present
    @RequestMapping("present")
    public String present(){
        return "yyb/present";
    }
    //跳转现金券页面money
    @RequestMapping("money")
    public String money(){
        return "yyb/money";
    }
    //跳转喜欢的商品页面like
    @RequestMapping("like")
    public String like(){
        return "yyb/like";
    }
    //跳转优惠券页面discount
    @RequestMapping("discount")
    public String discount(){
        return "yyb/discount";
    }
    //跳转收货地址页面area
    @RequestMapping("area")
    public String area(){
        return "yyb/area";
    }
    //跳转红包页面red
    @RequestMapping("red")
    public String red(){
        return "yyb/red";
    }
    //跳转我的订单页面order
    @RequestMapping("order")
    public String order(){
        return "yyb/order";
    }
    //跳转评价晒单页面
    @RequestMapping("ping")
    public String ping(){
        return "yyb/ping";
    }
    //跳转话费充值订单页面
    @RequestMapping("topUp")
    public String topUp(){
        return "yyb/topUp";
    }
    /*于英彬(个人中心)毕*/
}
