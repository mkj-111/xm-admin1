package com.jk.service;

import java.math.BigDecimal;

public interface DelMoneyServcie {
    void delMoney(Integer userId, BigDecimal orderSumPrice);
}
