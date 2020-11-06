package com.jk.controller;

import com.jk.entity.SkillBean;
import com.jk.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/4
 */
@RestController
public class SkillController {

    @Autowired
    private SkillService skillService;


    //查询所有秒杀商品
    @RequestMapping("findskill")
    public List<SkillBean>findskill(){
        return skillService.findskill();
    }
}
