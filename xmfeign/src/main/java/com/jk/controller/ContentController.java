package com.jk.controller;

import com.jk.entity.xmcontent;
import com.jk.pojo.RedisConstant;
import com.jk.service.ContentService;
import com.jk.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("con")
public class ContentController {
    @Resource
    private ContentService contentService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("findAllByCategoryId")
    @ResponseBody
    public List<xmcontent> findAllByCategoryId(Long categoryId) {

        List<xmcontent> goodsBeabs = (List)redisUtil.get(RedisConstant.Lunbo_Key);
        if(goodsBeabs == null || goodsBeabs.isEmpty()) {
            goodsBeabs = contentService.findAllByCategoryId(categoryId);
            redisUtil.set(RedisConstant.Lunbo_Key,goodsBeabs);
            // 设置key的过期时间
            //redisUtil.expire(RedisConstant.USER_LIST_KEY + "_" + user, 60);
        }
        return goodsBeabs;
    }

}
