package com.jk.controller;

import com.jk.entity.xmuser;
import com.jk.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class usercontroller {
    @Resource
    private UserService UserService;

    @RequestMapping("login")
    public xmuser login(@RequestBody xmuser user) {
        return UserService.login(user);
    }
}
