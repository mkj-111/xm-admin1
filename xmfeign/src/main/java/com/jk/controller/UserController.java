package com.jk.controller;

import com.jk.entity.xmuser;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService UserService;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    //普通的登录
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
      //首页加载登录信息
      @RequestMapping("findLoginStatus")
      @ResponseBody
      public xmuser findLoginStatus(HttpSession session){
          xmuser user = (xmuser) session.getAttribute("user");
          return user;
      }
        //注销
        @RequestMapping("zhuxiao")
        public String zhuxiao(HttpSession session){
            session.removeAttribute("user");
            return "main_page";
        }
        //修改用户信息
        @RequestMapping("updateUserBean")
        @ResponseBody
        public void updateUserBean(Integer id,String name,Integer sex){
        UserService.updateUserBean(id,name,sex);
    }
    //根据手机号查找用户
    @RequestMapping("findbyphone")
    @ResponseBody
    public xmuser findbyphone(@RequestParam String phone, HttpSession session){
        xmuser user=UserService.findbyphone(phone);
        if(user!=null){
            session.setAttribute("user",user);
        }
        return user;
    }

    @RequestMapping("add")
    @ResponseBody
    public void add(@RequestParam String phone){
        UserService.add(phone);
    }

}
