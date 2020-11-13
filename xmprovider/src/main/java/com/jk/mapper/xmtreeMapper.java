package com.jk.mapper;

import com.jk.entity.xmtree;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface xmtreeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(xmtree record);

    int insertSelective(xmtree record);

    xmtree selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(xmtree record);

    int updateByPrimaryKey(xmtree record);

    List<xmtree> findtree(int pid);
}