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
}
