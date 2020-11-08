package com.jk.service;

import com.jk.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> findGoods(Integer typeId);

    Goods findgoodbyid(int id);
}
