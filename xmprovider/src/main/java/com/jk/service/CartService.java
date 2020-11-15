package com.jk.service;

import com.jk.entity.Goods;

import java.util.List;

public interface CartService {
    List<Goods> findGoods(Integer id);

}
