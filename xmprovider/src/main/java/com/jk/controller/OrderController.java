package com.jk.controller;


import com.jk.entity.OrderGoods;
import com.jk.entity.TorderVo;
import com.jk.service.TorderSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private TorderSrevice torderSrevice;


    //根据用户id查询状态为2已支付的订单
    @RequestMapping("findorder")
    public List<OrderGoods>findorder(@RequestParam Integer userId){
        return torderSrevice.findorder(userId);
    }
    //根据用户id查询状态为3待发货的订单
    @RequestMapping("findorder3")
    public List<OrderGoods>findorder3(@RequestParam Integer userId){
        return torderSrevice.findorder3(userId);
    }
    //根据用户id查询状态为4待收货的订单
    @RequestMapping("findorder4")
    public List<OrderGoods>findorder4(@RequestParam Integer userId){
        return torderSrevice.findorder4(userId);
    }

    //根据用户id查询状态为5待评价的订单
    @RequestMapping("findorder5")
    public List<OrderGoods>findorder5(@RequestParam Integer userId){
        return torderSrevice.findorder5(userId);
    }

    //确认收货
    @RequestMapping("updateorder")
    public void updateorder(@RequestParam Integer id){
         torderSrevice.updateorder(id);
    }
    @RequestMapping("deleteorder")
    public void deleteorder(@RequestParam Integer id){
        torderSrevice.deleteorder(id);
    }




    //highcharts报表
    @RequestMapping("/highcharts")
    public List<TorderVo> highcharts() {
        List<TorderVo> list = torderSrevice.highcharts();
        return list;
    }
}
