package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.entity.GoodsBeab;
import com.jk.entity.xmuser;
import com.jk.service.LxTopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 *  @author: 李新
 *  @Date: 2020/11/4 16:10
 *  @Description:
 *  励志：一giao窝里giao giao
 */
@Controller
@RequestMapping("top")
public class LxTopController {

    @Autowired
    private LxTopService lxTopService;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @RequestMapping("queryTopList")
    @ResponseBody
    public List<GoodsBeab> queryTopList(String topName, Integer type){
        String  goodsKey = "goodsKey";
        if(redisTemplate.hasKey(goodsKey)){
            String user = redisTemplate.opsForValue().get(goodsKey).toString();
            List<GoodsBeab> goodsBeabs = JSON.parseArray(user, GoodsBeab.class);
            return goodsBeabs;
        }else {
            List<GoodsBeab> goodsBeabs = lxTopService.queryTopList(topName, type);
            String s = JSON.toJSONString(goodsBeabs);
            redisTemplate.opsForValue().set(goodsKey,s);
            return goodsBeabs;
        }

    }
    @RequestMapping("queryTopGoodsInfoById")
    @ResponseBody
    public String queryTopGoodsInfoById(Integer id){

        return "";
    }
}
