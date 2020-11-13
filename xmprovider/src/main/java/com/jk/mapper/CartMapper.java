package com.jk.mapper;

import com.jk.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CartMapper {
    List<Goods> findGoods(@Param("versionId") Integer versionId, @Param("goodsName") String goodsName);

}
