package com.jk.mapper;

import com.jk.entity.xmcontent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface xmcontentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(xmcontent record);

    int insertSelective(xmcontent record);

    xmcontent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(xmcontent record);

    int updateByPrimaryKey(xmcontent record);

    List<xmcontent> findAllByCategoryId(Long categoryId);
}