package com.jk.service.Impl;

import com.jk.entity.SeckillGoods;
import com.jk.mapper.SeckillGoodsMapper;
import com.jk.service.SeckillGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: TODO
 * @author: 曹峻
 * @date: 2020/11/9 10:58
 * @version: v1.0
 */

@Service
public class SeckillGoodsServiceImpl implements SeckillGoodsService {

    @Autowired
    private SeckillGoodsMapper seckillGoodsMapper;


    @Override
    public List<SeckillGoods> findseckillGoods(Integer typeId) {

        return seckillGoodsMapper.findseckillGoods(typeId);
    }
}
