package com.jk.service;

import com.jk.entity.SkillBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
