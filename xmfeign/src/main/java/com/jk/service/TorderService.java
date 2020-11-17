package com.jk.service;

import com.jk.entity.OrderGoods;
import com.jk.entity.TorderVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("xmprovider")
public interface TorderService {

    @RequestMapping("/highcharts")
    public List<TorderVo> highcharts();

    //根据用户id查询状态为2已支付的订单
    @RequestMapping("findorder")
    public List<OrderGoods>findorder(@RequestParam Integer userId);
    //根据用户id查询状态为3待发货的订单
    @RequestMapping("findorder3")
    public List<OrderGoods>findorder3(@RequestParam Integer userId);
    //根据用户id查询状态为4待收的订单
    @RequestMapping("findorder4")
    public List<OrderGoods>findorder4(@RequestParam Integer userId);
}
