package com.jk.controller;

import com.jk.entity.ColorBean;
import com.jk.service.MkjColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/6
 */
@Controller
@RequestMapping("color")
public class MkjColorController {

    @Autowired
    private MkjColorService mkjColorService;


    @RequestMapping("findcolor")
    @ResponseBody
    public List<ColorBean>findcolor(String goodsname){
        return mkjColorService.findcolor(goodsname);
    }
}
