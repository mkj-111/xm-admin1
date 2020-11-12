package com.jk.mapper;

import com.jk.entity.xmuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
    xmuser findUserByName(String userAccount);

    @Update("update xm_user set user_name = #{name},user_Sex = #{sex} where user_Id = #{id}")
    void updateUserBean(Integer id, String name, Integer sex);
}
