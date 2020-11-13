package com.jk.service;

import com.jk.entity.OrderGoods;

import java.math.BigDecimal;

public interface WebLogService {
    void insertOrderGoods(OrderGoods orderGoods);

    void delNum(String goodsId, String orderNum);

    void delMoney(Integer userId, BigDecimal orderSumPrice);
}
