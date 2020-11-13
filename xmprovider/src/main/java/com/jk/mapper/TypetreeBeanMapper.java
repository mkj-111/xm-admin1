package com.jk.mapper;

import com.jk.entity.TypetreeBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface TypetreeBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TypetreeBean record);

    int insertSelective(TypetreeBean record);

    TypetreeBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TypetreeBean record);

    int updateByPrimaryKey(TypetreeBean record);

    List<TypetreeBean> findtype(Integer pid);

}