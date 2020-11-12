package com.jk.controller;

import com.jk.entity.TorderVo;
import com.jk.service.TorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/order")
public class TorderController {

    @Autowired
    private TorderService torderService;

    ////highcharts
    @RequestMapping("/highcharts")
    @ResponseBody
    public Map<String, Object> highcharts() {
        List<TorderVo> list = torderService.highcharts();
        Map<String, Object> map = new HashMap<>();
        List<Integer> cou = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        List<String> dat = new ArrayList<>();
        for (TorderVo torderVo : list) {
            cou.add(torderVo.getCounts());
            sum.add(torderVo.getSums());
            dat.add(torderVo.getDates());
        }
        map.put("sum", sum);
        map.put("cou", cou);
        map.put("dat", dat);
        return map;
    }
}
