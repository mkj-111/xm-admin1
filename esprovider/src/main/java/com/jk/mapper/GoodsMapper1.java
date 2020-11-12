package com.jk.mapper;

import com.jk.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/11
 */
@Mapper
public interface GoodsMapper1 {


    List<Goods> findall();
}
