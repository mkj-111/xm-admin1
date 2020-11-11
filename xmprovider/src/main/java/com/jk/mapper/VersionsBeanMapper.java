package com.jk.mapper;

import com.jk.entity.VersionsBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface VersionsBeanMapper {
    int deleteByPrimaryKey(Integer versionsId);

    int insert(VersionsBean record);

    int insertSelective(VersionsBean record);

    VersionsBean selectByPrimaryKey(Integer versionsId);

    int updateByPrimaryKeySelective(VersionsBean record);

    int updateByPrimaryKey(VersionsBean record);

    List<VersionsBean> findversion(@Param("colorid") Integer colorid);

    VersionsBean findversionsId(@Param("versionsId") Integer versionsId);
}