package com.jk.controller;


import com.jk.entity.TorderVo;
import com.jk.service.TorderSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OrderController {
    @Autowired
    private TorderSrevice torderSrevice;
    //highcharts报表

    @RequestMapping("/highcharts")
    public List<TorderVo> highcharts() {
        List<TorderVo> list = torderSrevice.highcharts();

        return list;
    }


}
