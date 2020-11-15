package com.jk.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface DelNumMapper {

    @Update("update xm_goods set goods_num=goods_num-#{goodsNum} where id=#{goodsId}")
    void delNum(@Param("goodsId") String goodsId,@Param("goodsNum") String goodsNum);
}
