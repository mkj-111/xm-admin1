package com.jk.service.Impl;

import com.jk.entity.Goods;
import com.jk.mapper.GoodsMapper;
import com.jk.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: TODO
 * @author: 曹峻
 * @date: 2020/11/5 14:13
 * @version: v1.0
 */

@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> findGoods(Integer typeId) {
        return goodsMapper.findGoods(typeId);
    }
}
