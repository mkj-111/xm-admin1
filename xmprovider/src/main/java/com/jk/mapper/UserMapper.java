package com.jk.mapper;

import com.jk.entity.xmuser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    xmuser findUserByName(String userAccount);
}
