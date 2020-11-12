package com.jk.controller;

import com.jk.entity.VersionsBean;
import com.jk.service.MkjVersionService;
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
public class MkjVersionController {

    @Resource
    private MkjVersionService mkjVersionService;


    @RequestMapping("findversion")
    public List<VersionsBean> findversion(@RequestParam Integer colorid) {
        return mkjVersionService.findversion(colorid);
    }

    @RequestMapping("findversionsId")
    public VersionsBean findversionsId(@RequestParam Integer versionsId) {
        return mkjVersionService.findversionsId(versionsId);
    }

}
