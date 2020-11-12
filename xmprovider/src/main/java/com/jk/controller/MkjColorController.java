package com.jk.controller;

import com.jk.entity.ColorBean;
import com.jk.service.MkjColorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/6
 */
@RestController
public class MkjColorController {

    @Resource
    private MkjColorService mkjColorService;


    @RequestMapping("findcolor")
    public List<ColorBean> findcolor(@RequestParam String goodsname) {
        return mkjColorService.findcolor(goodsname);
    }
}
