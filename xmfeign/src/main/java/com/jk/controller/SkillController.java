package com.jk.controller;

import com.jk.entity.SkillBean;
import com.jk.service.SkillService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
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
    public List<SkillBean> findskill() {
        return skillService.findskill();
    }

    //通过id查询
    @RequestMapping("findskillbyid")
    public SkillBean findskillbyid(Integer id){
        return skillService.findskillbyid(id);
    }

    //session获取
    @RequestMapping("getskill")
    public SkillBean getskill(HttpSession session){
        SkillBean skill =(SkillBean) session.getAttribute("skill");
        return skill;
    }
}
