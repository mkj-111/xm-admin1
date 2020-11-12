package com.jk.controller;

import com.jk.entity.SeckillGoods;
import com.jk.service.SeckillGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: TODO
 * @author: 曹峻
 * @date: 2020/11/9 10:57
 * @version: v1.0
 */

@RestController
public class SeckillGoodsController {

    @Autowired
    private SeckillGoodsService seckillGoodsService;

    @RequestMapping("/findSeckillGoods")
    public List<SeckillGoods> findseckillGoods(@RequestParam Integer typeId) {

        return seckillGoodsService.findseckillGoods(typeId);
    }
}
