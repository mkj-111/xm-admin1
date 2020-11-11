package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.entity.xmuser;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService UserService;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @RequestMapping("login")
    @ResponseBody
    public String login(xmuser user, HttpServletRequest request, HttpServletResponse response, HttpSession session){
        xmuser userl = UserService.login(user);

        if(userl==null){
            return "账号不存在";
        }
        if(!userl.getUserPassword().equals(user.getUserPassword())){
            return "密码错误";
        }
        request.getSession().setAttribute("user",userl);
        xmuser userlll = (xmuser) session.getAttribute("user");
        System.out.println(userlll);
        return "成功";
      }
      @RequestMapping("findLoginStatus")
      @ResponseBody
      public xmuser findLoginStatus(HttpSession session){
          xmuser user = (xmuser) session.getAttribute("user");
          return user;
      }

    @RequestMapping("zhuxiao")
    public String zhuxiao(HttpSession session){
        session.removeAttribute("user");
        return "main_page";
    }
    @RequestMapping("updateUserBean")
    @ResponseBody
    public void updateUserBean(Integer id,String name,Integer sex){
        UserService.updateUserBean(id,name,sex);
    }
}
