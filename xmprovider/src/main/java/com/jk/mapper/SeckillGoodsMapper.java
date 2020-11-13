package com.jk.mapper;

import com.jk.entity.SeckillGoods;
import com.jk.entity.SkillBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface SeckillGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SkillBean record);

    int insertSelective(SkillBean record);

    SkillBean selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SkillBean record);

    int updateByPrimaryKey(SkillBean record);

    List<SeckillGoods> findseckillGoods(Integer typeId);
}