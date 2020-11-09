package com.jk.controller;

import com.jk.entity.Goods;
import com.jk.pojo.RedisConstant;
import com.jk.service.CartService;
import com.jk.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class CartController {

    @Autowired
    private RedisUtil redisUtil;

  @Autowired
  private CartService cartService;
    @RequestMapping("/search_add")
    public  String search_add(Integer versionId, Integer userId){
        return  "admin/search_add";
    }


    @RequestMapping("/search_success")
    public  String search_success(Integer versionId, Integer userId,String goodsName){

        List<Goods> goodsList= (List<Goods>) redisUtil.get(userId.toString());
        //为空时  加入第一件商品
         if(goodsList==null||goodsList.isEmpty()){
             List<Goods> goodsList1=  cartService.findGoods(versionId,goodsName);
             redisUtil.set(userId.toString(),goodsList1);
         }else {//第二次存入  在redis拼接
             List<Goods> goodsList2= cartService.findGoods(versionId,goodsName);
             goodsList.set(goodsList.size(), (Goods) goodsList2);
         }

        return  "admin/search_success";
    }




}
