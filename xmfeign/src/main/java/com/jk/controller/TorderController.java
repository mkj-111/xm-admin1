package com.jk.controller;

import com.jk.entity.OrderGoods;
import com.jk.entity.PingLunBean;
import com.jk.entity.TorderVo;
import com.jk.entity.xmuser;
import com.jk.service.TorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("/order")
public class TorderController {

    @Autowired
    private TorderService torderService;

    @Autowired
    private MongoTemplate mongoTemplate;

    //评论
    @RequestMapping("ping")
    @ResponseBody
    public void ping(Integer id,String pinglun,HttpSession session){
        xmuser user = (xmuser) session.getAttribute("user");
        String userName = user.getUserName();
        PingLunBean pp = new PingLunBean();
        long time = new Date().getTime();
        Date now=new Date();
        pp.setCreateDate(now.toString());
        pp.setDianzan(0);
        pp.setGoodsId(id);
        pp.setInfo(pinglun);
        pp.setStatus(0);
        pp.setUserImg("");
        pp.setUserName(userName);
        mongoTemplate.save(pp);

        torderService.deleteorder(id);
    }
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
    //根据用户id查询状态为5待评价的订单
    @RequestMapping("findorder5")
    @ResponseBody
    public List<OrderGoods>findorder5(HttpSession session){
        xmuser user = (xmuser) session.getAttribute("user");
        Integer userId = user.getUserId();
        return torderService.findorder5(userId);
    }

    //确认收货
    @RequestMapping("updateorder")
    @ResponseBody
    public void updateorder(Integer id){
         torderService.updateorder(id);
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
