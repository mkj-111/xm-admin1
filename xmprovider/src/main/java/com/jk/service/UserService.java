package com.jk.service;


import com.jk.entity.xmuser;

public interface UserService {


    xmuser login(xmuser user);

    void updateUserBean(Integer id, String name, Integer sex);

    xmuser findbyphone(String phone);

     void   add(String phone);
}
