package com.jk.mapper;

import com.jk.entity.ColorBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ColorBeanMapper {
    int deleteByPrimaryKey(Integer colorId);

    int insert(ColorBean record);

    int insertSelective(ColorBean record);

    ColorBean selectByPrimaryKey(Integer colorId);

    int updateByPrimaryKeySelective(ColorBean record);

    int updateByPrimaryKey(ColorBean record);

    List<ColorBean> findcolor(@Param("goodsname") String goodsname);
}