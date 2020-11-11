package com.jk.service;

import com.jk.entity.SeckillGoods;

import java.util.List;

public interface SeckillGoodsService {

    List<SeckillGoods> findseckillGoods(Integer typeId);
}
