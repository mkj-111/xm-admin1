package com.jk.controller;

import com.jk.entity.Goods;
import com.jk.pojo.RedisConstant;
import com.jk.service.GoodsService;
import com.jk.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/findGoods")
    public List<Goods> findGoods(Integer typeId) {

        List<Goods> goodsBeabs = (List)redisUtil.get(RedisConstant.Goods_Key+"_"+typeId);
        if(goodsBeabs == null || goodsBeabs.isEmpty()) {
            goodsBeabs = goodsService.findGoods(typeId);
            redisUtil.set(RedisConstant.Goods_Key+"_"+typeId,goodsBeabs);
            // 设置key的过期时间
            //redisUtil.expire(RedisConstant.USER_LIST_KEY + "_" + user, 60);
        }
        return goodsBeabs;
    }

    @RequestMapping("findgoodsbyid")
    public Goods findgoodsbyid(HttpSession session){
        Goods goods = (Goods)session.getAttribute("goods");
        return goods;
    }

}
