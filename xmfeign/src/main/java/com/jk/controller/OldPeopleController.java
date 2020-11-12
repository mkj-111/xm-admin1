package com.jk.controller;

import com.jk.entity.TbAreas;
import com.jk.entity.TbCities;
import com.jk.entity.TbProvinces;
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class OldPeopleController {
    @Resource
    private OldPeopleService oldPeopleService;

    @RequestMapping("getSheng")
    public List<TbProvinces> getSheng() {
        return oldPeopleService.getSheng();
    }

    @RequestMapping("findShi")
    public List<TbCities> findShi(String provinceid) {
        return oldPeopleService.findShi(provinceid);
    }

    @RequestMapping("findXian")
    public List<TbAreas> findXian(String cityid) {
        return oldPeopleService.findXian(cityid);
    }


}
