package com.jk.controller;

import com.jk.entity.GoodsBeab;
import com.jk.service.LxTopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 *  @author: 李新
 *  @Date: 2020/11/4 16:10
 *  @Description:
 *  励志：一giao窝里giao giao
 */
@Controller
@RequestMapping("top")
public class LxTopController {

    @Autowired
    private LxTopService lxTopService;


    @RequestMapping("queryTopList")
    @ResponseBody
    public List<GoodsBeab> queryTopList(String topName, Integer type){
        return lxTopService.queryTopList(topName,type);
    }
    @RequestMapping("queryTopGoodsInfoById")
    @ResponseBody
    public String queryTopGoodsInfoById(Integer id){

        return "";
    }
}
