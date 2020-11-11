package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/5
 */
@Controller
@RequestMapping("phone")
public class phone {


    @RequestMapping("tophone")
    public String phone(String id){
        return "phone/"+id;
    }
}
