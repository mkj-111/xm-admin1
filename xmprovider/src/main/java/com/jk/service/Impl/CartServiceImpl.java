package com.jk.service.Impl;

import com.jk.entity.Goods;
import com.jk.mapper.CartMapper;
import com.jk.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartMapper cartMapper;
    @Override
    public List<Goods> findGoods(Integer versionId,String goodsName) {


        return cartMapper.findGoods(versionId,goodsName);
    }

    @Override
    public Goods goodsList2(Integer versionId, String goodsName) {
        return cartMapper.goodsList2(versionId,goodsName);
    }
}
