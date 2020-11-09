package com.jk.service;

import com.jk.entity.xmuser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("xmprovider")
public interface UserService {
    @RequestMapping("login")
    public xmuser login(@RequestBody xmuser user);
}
