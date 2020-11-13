package com.jk.controller;

import com.jk.entity.GoodsBeab;
import com.jk.entity.HuiFuBean;
import com.jk.entity.PingLunBean;
import com.jk.service.LxTopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class LxTopController {


    @Autowired
    private LxTopService lxTopService;

    @RequestMapping("queryTopList")
    @ResponseBody
    public List<GoodsBeab> queryTopList(@RequestParam String topName, @RequestParam Integer type) {
        return lxTopService.queryTopList(topName, type);
    }

    @RequestMapping("toList")
    @ResponseBody
    public String toList(Integer id) {
        System.out.println(id + "奥力给");
        return "";
    }
    @RequestMapping("findPingLunId")
    @ResponseBody
    public List<PingLunBean> findPingLunId(@RequestParam Integer ids){
        return lxTopService.findPingLunId(ids);
    }

    @RequestMapping("addPingLun")
    @ResponseBody
    public void addPingLun(@RequestBody PingLunBean pingLunBean){
        lxTopService.addPingLun(pingLunBean);
    }

    //点赞
    @RequestMapping("updateDianZan")
    @ResponseBody
    public void updateDianZan(@RequestParam Integer dian,@RequestParam String id){
        lxTopService.updateDianZan(dian,id);
    }
    //回复
    @RequestMapping("insertHuiFu")
    @ResponseBody
    public void insertHuiFu(@RequestParam String huiInfo,@RequestParam String huifuId){
        String aa = huifuId;
        HuiFuBean huiFuBean = new HuiFuBean();
        long time = new Date().getTime();
        huiFuBean.setHuifuId(time+"a");
        huiFuBean.setPinglunId(aa);
        huiFuBean.setHuifuInfo(huiInfo);
        huiFuBean.setHuifuName("李新");
        huiFuBean.setHuifuCount(0);
        huiFuBean.setHuifuImg("14252");
        lxTopService.insertHuiFu(huiFuBean);
    }

    @RequestMapping("queryHuiFu")
    @ResponseBody
    public List<HuiFuBean> queryHuiFu(@RequestParam String pid){
        return lxTopService.queryHuiFu(pid);
    }
}
