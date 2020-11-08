package com.jk.mapper;

import com.jk.entity.SkillBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SkillBeanMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SkillBean record);

    int insertSelective(SkillBean record);

    SkillBean selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SkillBean record);

    int updateByPrimaryKey(SkillBean record);

    List<SkillBean> findskill();
}