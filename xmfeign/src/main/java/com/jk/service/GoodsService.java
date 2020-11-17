package com.jk.service;


import com.jk.entity.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("xmprovider")
public interface GoodsService {

    @RequestMapping("/findGoods")
    public List<Goods> findGoods(@RequestParam Integer typeId);

    @RequestMapping("/findgoodbyid")
    public Goods findgoodbyid(@RequestParam int id);

    @RequestMapping("findbu")
    public Goods findbu(@RequestParam Integer versionid,@RequestParam String goodsname);
}
