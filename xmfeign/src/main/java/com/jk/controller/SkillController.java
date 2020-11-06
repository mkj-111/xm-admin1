package com.jk.controller;

import com.jk.entity.SkillBean;
import com.jk.service.SkillService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/4
 */
@RestController
@RequestMapping("skill")
public class SkillController {

    @Resource
    private SkillService skillService;


    //查询所有秒杀商品
    @RequestMapping("findskill")
    public List<SkillBean> findskill(){
        return skillService.findskill();
    }
}
