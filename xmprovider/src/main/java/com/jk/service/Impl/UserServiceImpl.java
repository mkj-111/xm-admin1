package com.jk.service.Impl;

import com.jk.entity.xmuser;
import com.jk.mapper.UserMapper;
import com.jk.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper UserMapper;

    @Override
    public xmuser login(xmuser user) {

        xmuser user1 = UserMapper.findUserByName(user.getUserAccount());

        return user1;
    }

    @Override
    public void updateUserBean(Integer id, String name, Integer sex) {
        UserMapper.updateUserBean(id,name,sex);
    }

    @Override
    public xmuser findbyphone(String phone) {
        return UserMapper.findbyphone(phone);
    }

    @Override
    public void add(String phone) {
        xmuser user=new xmuser();
        double v = Math.floor(Math.random() * 9000000 + 1000000);
        int aa=(int) v;
        String name = String.valueOf(aa);

        user.setUserName(name);
        user.setPhone(phone);
        UserMapper.add(user);
    }
}
