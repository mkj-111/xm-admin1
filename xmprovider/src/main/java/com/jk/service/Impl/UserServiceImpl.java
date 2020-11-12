package com.jk.service.Impl;

import com.jk.entity.xmuser;
import com.jk.mapper.UserMapper;
import com.jk.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper UserMapper;

    @Override
    public xmuser login(xmuser user) {

        xmuser user1 = UserMapper.findUserByName(user.getUserAccount());

        return user1;
    }
}
