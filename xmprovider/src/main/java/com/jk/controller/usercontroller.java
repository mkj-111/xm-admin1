package com.jk.controller;

import com.jk.entity.xmuser;
import com.jk.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class usercontroller {
@Resource
    private UserService UserService;

    @RequestMapping("login")
    public xmuser login(@RequestBody xmuser user){
        return UserService.login(user);
    }

    @RequestMapping("updateUserBean")
    public void updateUserBean(@RequestParam Integer id, @RequestParam String name, @RequestParam Integer sex){
        UserService.updateUserBean(id,name,sex);
    }
}
