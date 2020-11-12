/**
 * <pre>项目名称:ssm_duanxin
 * 文件名称:LoginController.java
 * 包名:com.jk.zjf.controller
 * 创建日期:2020年9月22日下午5:17:42
 * Copyright (c) 2020, yuxy123@gmail.com All Rights Reserved.</pre>
 */
package com.jk.controller;

import com.jk.utils.LoginMessageTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 */
@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;


    @RequestMapping("sendCode")
    @ResponseBody
    public Map<String, Object> sendCode(String phone) {
        Map<String, Object> paramMap = new HashMap<>();
        LoginMessageTest.loginMessage(phone, paramMap);
        Integer StatusCode = (Integer) paramMap.get("code");
        if (StatusCode == 200) {
            redisTemplate.opsForValue().set("sendCode" + phone, (String) paramMap.get("obj"), 60, TimeUnit.SECONDS);
            paramMap.put("msg", "验证码发送成功");
        } else {
            paramMap.put("msg", "验证码发送失败 请重试");

        }
        return paramMap;
    }


    @RequestMapping("doLogin")
    @ResponseBody
    public Map<String, Object> doLogin(HttpServletRequest request, String phone, String code) {
        String vCode = (String) redisTemplate.opsForValue().get("sendCode" + phone);
        Map<String, Object> paramMap = new HashMap<>();
        if (code.equals(vCode)) {
            paramMap.put("msg", "登录成功");
            request.getSession().setAttribute("user", phone);
        } else {
            paramMap.put("msg", "验证码验证失败");
        }
        return paramMap;
    }
}
