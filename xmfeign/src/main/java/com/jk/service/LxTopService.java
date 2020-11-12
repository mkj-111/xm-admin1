package com.jk.service;

import com.jk.entity.GoodsBeab;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "xmprovider")
public interface LxTopService {

    @RequestMapping("queryTopList")
    public List<GoodsBeab> queryTopList(@RequestParam String topName, @RequestParam Integer type);
}
