package com.jk.service.Impl;

import com.jk.entity.xmuser;
import com.jk.mapper.UserMapper;
import com.jk.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper UserMapper;

    @Override
    public String login(xmuser user) {

        xmuser user1=UserMapper.findUserByName(user.getUserAccount());
        if(user1==null){
            return "账号不存在";
        }
        if(!user1.getUserPassword().equals(user.getUserPassword())){
            return "密码错误";
        }
        return "成功";
    }
}
