package com.jk.controller;

import com.jk.entity.Goods;
import com.jk.service.GoodsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: TODO
 * @author: 曹峻
 * @date: 2020/11/5 14:12
 * @version: v1.0
 */

@RestController
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    @RequestMapping("/findGoods")
    public List<Goods> findGoods(@RequestParam Integer typeId) {
        return goodsService.findGoods(typeId);
    }

    @RequestMapping("/findgoodbyid")
    public Goods findgoodbyid(@RequestParam int id) {
        return goodsService.findgoodbyid(id);
    }

}
