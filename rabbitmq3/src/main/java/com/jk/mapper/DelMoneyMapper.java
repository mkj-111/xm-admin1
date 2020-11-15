package com.jk.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;

@Mapper
public interface DelMoneyMapper {
    @Update("update xm_user  set money=money-#{orderSumPrice} where user_id=#{userId}")
    void delMoney(@Param("userId") Integer userId,@Param("orderSumPrice")  BigDecimal orderSumPrice);
}
