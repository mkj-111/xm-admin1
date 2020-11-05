package com.jk.mapper;

import com.jk.entity.xmcontent;

import java.util.List;

public interface xmcontentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(xmcontent record);

    int insertSelective(xmcontent record);

    xmcontent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(xmcontent record);

    int updateByPrimaryKey(xmcontent record);

    List<xmcontent> findAllByCategoryId(Long categoryId);
}