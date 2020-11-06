package com.jk.service;

import com.jk.entity.TorderVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("xmprovider")
public interface TorderService {

    @RequestMapping("/highcharts")
    public List<TorderVo> highcharts();


}
