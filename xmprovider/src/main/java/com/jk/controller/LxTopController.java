package com.jk.controller;

import com.jk.entity.GoodsBeab;
import com.jk.service.LxTopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LxTopController {

    @Autowired
    private LxTopService lxTopService;

    @RequestMapping("queryTopList")
    @ResponseBody
    public List<GoodsBeab> queryTopList(@RequestParam String topName, @RequestParam Integer type) {
        return lxTopService.queryTopList(topName, type);
    }

    @RequestMapping("toList")
    @ResponseBody
    public String toList(Integer id) {
        System.out.println(id + "奥力给");
        return "";
    }
}
