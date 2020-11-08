package com.jk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/1
 */

@Controller
public class HigCharts {
    @RequestMapping("/hchars")
    public  String Hchars(){

        return  "admin/highcharts";
    }

    @RequestMapping("/search_success")
    public  String search_success(){

        return  "admin/search_success";
    }


    @RequestMapping("/search_add")
    public  String search_add(){

        return  "admin/search_add";
    }


}
