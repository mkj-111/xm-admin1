package com.jk.controller;

import com.jk.entity.SeckillGoods;
import com.jk.service.SeckillGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: TODO
 * @author: 曹峻
 * @date: 2020/11/9 11:04
 * @version: v1.0
 */

@RestController
@RequestMapping("/seckill")
public class SeckillGoodsController {

    @Autowired
    private SeckillGoodsService seckillGoodsService;

    @RequestMapping("/findSeckillGoods")
    public List<SeckillGoods> findSeckillGoods(Integer typeId) {

        return seckillGoodsService.findseckillGoods(typeId);
    }
}
