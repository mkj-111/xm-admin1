package com.jk.service;

import com.jk.entity.SkillBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/4
 */
@FeignClient("xmprovider")
public interface SkillService {

    @RequestMapping("findskill")
    public List<SkillBean> findskill();


    //通过id查询
    @RequestMapping("findskillbyid")
    public SkillBean findskillbyid(@RequestParam Integer id);

}
