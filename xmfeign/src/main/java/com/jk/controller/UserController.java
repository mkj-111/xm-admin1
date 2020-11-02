package com.jk.controller;

import com.jk.entity.xmuser;
import com.jk.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {
@Resource
    private UserService UserService;

    @RequestMapping("login")
    @ResponseBody
    public String login(xmuser user){

    return UserService.login(user);
}
}
