package com.jk.service;

import com.jk.entity.TbAreas;
import com.jk.entity.TbCities;
import com.jk.entity.TbProvinces;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("xmprovider")
public interface OldPeopleService {

    @RequestMapping("getSheng")
    public List<TbProvinces> getSheng();

    @RequestMapping("findShi")
    public List<TbCities> findShi(@RequestParam String provinceid);

    @RequestMapping("findXian")
    public List<TbAreas> findXian(@RequestParam String cityid);

    @RequestMapping("findsheng")
    TbProvinces findsheng(@RequestParam String shengId);

    @RequestMapping("findshier")
    TbCities findshier(@RequestParam String shiId);

    @RequestMapping("findxianer")
    TbAreas findxianer(@RequestParam String xianId);
}
