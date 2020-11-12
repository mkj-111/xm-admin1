package com.jk.controller;

import com.jk.entity.TbAreas;
import com.jk.entity.TbCities;
import com.jk.entity.TbProvinces;
import com.jk.service.OldPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private OldPeopleService oldPeopleService;

    @RequestMapping("getSheng")
    public List<TbProvinces> getSheng() {
        return oldPeopleService.getSheng();
    }

    @RequestMapping("findShi")
    public List<TbCities> findShi(@RequestParam String provinceid) {
        return oldPeopleService.findShi(provinceid);
    }

    @RequestMapping("findXian")
    public List<TbAreas> findXian(@RequestParam String cityid) {
        return oldPeopleService.findXian(cityid);
    }


    @RequestMapping("findsheng")
    public TbProvinces findsheng(@RequestParam String shengId) {

        return oldPeopleService.findsheng(shengId);
    }

    @RequestMapping("findshier")
    public TbCities findshier(@RequestParam String shiId) {

        return oldPeopleService.findshier(shiId);
    }

    @RequestMapping("findxianer")
    public TbAreas findxianer(@RequestParam String xianId) {

        return oldPeopleService.findxianer(xianId);
    }

}
