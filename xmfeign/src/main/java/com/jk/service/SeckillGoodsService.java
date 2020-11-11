package com.jk.service;

import com.jk.entity.SeckillGoods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @description: TODO
 * @author: 曹峻
 * @date: 2020/11/9 11:14
 * @version: v1.0
 */

@FeignClient("xmprovider")
public interface SeckillGoodsService {

    @RequestMapping("/findSeckillGoods")
    public List<SeckillGoods> findseckillGoods(@RequestParam Integer typeId);

}
