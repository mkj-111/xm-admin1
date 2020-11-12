package com.jk.service;

import com.jk.entity.xmuser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("xmprovider")
public interface UserService {
    @RequestMapping("login")
    public xmuser login(@RequestBody xmuser user);

    @RequestMapping("updateUserBean")
    public void updateUserBean(@RequestParam Integer id,@RequestParam String name,@RequestParam Integer sex);
}
