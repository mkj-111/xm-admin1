package com.jk.service;

import com.jk.entity.xmuser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@FeignClient("xmprovider")
public interface UserService {
    @RequestMapping("login")
    public String login(@RequestBody xmuser user);
}
