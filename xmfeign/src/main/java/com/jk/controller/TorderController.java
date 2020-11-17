package com.jk.controller;

import com.jk.entity.OrderGoods;
import com.jk.entity.TorderVo;
import com.jk.entity.xmuser;
import com.jk.service.TorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/order")
public class TorderController {

    @Autowired
    private TorderService torderService;


    //根据用户id查询状态为2已支付的订单
    @RequestMapping("findorder")
    @ResponseBody
    public List<OrderGoods>findorder(HttpSession session){
        xmuser user = (xmuser) session.getAttribute("user");
        Integer userId = user.getUserId();
        return torderService.findorder(userId);
    }
    //根据用户id查询状态为3的订单
    @RequestMapping("findorder3")
    @ResponseBody
    public List<OrderGoods>findorder3(HttpSession session){
        xmuser user = (xmuser) session.getAttribute("user");
        Integer userId = user.getUserId();
        return torderService.findorder3(userId);
    }
    //根据用户id查询状态为4的订单
    @RequestMapping("findorder4")
    @ResponseBody
    public List<OrderGoods>findorder4(HttpSession session){
        xmuser user = (xmuser) session.getAttribute("user");
        Integer userId = user.getUserId();
        return torderService.findorder4(userId);
    }



    ////highcharts
    @RequestMapping("/highcharts")
    @ResponseBody
    public Map<String, Object> highcharts() {
        List<TorderVo> list = torderService.highcharts();
        Map<String, Object> map = new HashMap<>();
        List<Integer> cou = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        List<String> dat = new ArrayList<>();
        for (TorderVo torderVo : list) {
            cou.add(torderVo.getCounts());
            sum.add(torderVo.getSums());
            dat.add(torderVo.getDates());
        }
        map.put("sum", sum);
        map.put("cou", cou);
        map.put("dat", dat);
        return map;
    }
}
