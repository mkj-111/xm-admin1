package com.jk.controller;

import com.jk.entity.xmuser;
import com.jk.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class usercontroller {
    @Resource
    private UserService UserService;

    @RequestMapping("login")
    public xmuser login(@RequestBody xmuser user) {
        return UserService.login(user);
    }

    @RequestMapping("updateUserBean")
    public void updateUserBean(@RequestParam Integer id, @RequestParam String name, @RequestParam Integer sex){
        UserService.updateUserBean(id,name,sex);
    }

    @RequestMapping("findbyphone")
    public xmuser findbyphone(@RequestParam String phone){
        xmuser user=UserService.findbyphone(phone);
        return user;
    }

    @RequestMapping("add")
    public void add(@RequestParam String phone){
       UserService.add(phone);
    }
}
