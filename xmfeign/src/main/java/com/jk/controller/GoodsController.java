package com.jk.controller;

import com.jk.entity.Goods;
import com.jk.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @description: TODO
 * @author: 曹峻
 * @date: 2020/11/5 15:11
 * @version: v1.0
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/findGoods")
    public List<Goods> findGoods(Integer typeId) {
        return goodsService.findGoods(typeId);
    }

    @RequestMapping("findgoodsbyid")
    public Goods findgoodsbyid(HttpSession session) {
        Goods goods = (Goods) session.getAttribute("goods");
        return goods;
    }

}
