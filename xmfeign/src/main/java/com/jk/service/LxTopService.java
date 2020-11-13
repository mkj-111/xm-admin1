package com.jk.service;

import com.jk.entity.Goods;
import com.jk.entity.GoodsBeab;
import com.jk.entity.HuiFuBean;
import com.jk.entity.PingLunBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "xmprovider")
public interface LxTopService {

    @RequestMapping("queryTopList")
    public List<GoodsBeab> queryTopList(@RequestParam String topName, @RequestParam Integer type);

    @RequestMapping("queryPingLun")
    public List<PingLunBean> queryPingLun(@RequestParam String id);

    @RequestMapping("findPingLunId")
    public List<PingLunBean> findPingLunId(@RequestParam Integer ids);

    @RequestMapping("addPingLun")
    public void addPingLun(@RequestBody PingLunBean pingLunBean);

    @RequestMapping("updateDianZan")
    public void updateDianZan(@RequestParam Integer dian,@RequestParam String id);

    @RequestMapping("insertHuiFu")
    public void insertHuiFu(@RequestParam String huiInfo,@RequestParam String huifuId);

    @RequestMapping("queryHuiFu")
    public List<HuiFuBean> queryHuiFu(@RequestParam String pid);
}
