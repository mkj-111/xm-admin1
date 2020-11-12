package com.jk.controller;

import com.jk.entity.VersionsBean;
import com.jk.service.MkjVersionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/6
 */
@Controller
@RequestMapping("version")
public class MkjVersionController {

    @Resource
    private MkjVersionService mkjVersionService;


    @RequestMapping("findversion")
    @ResponseBody
    public List<VersionsBean> findversion(Integer colorid) {
        return mkjVersionService.findversion(colorid);
    }

    @RequestMapping("findversionsId")
    @ResponseBody
    public VersionsBean findversionsId(Integer versionsId) {
        return mkjVersionService.findversionsId(versionsId);
    }

}
