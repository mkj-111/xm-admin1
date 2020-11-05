package com.jk.service;

import com.jk.entity.xmcontent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("xmprovider")
public interface ContentService {
    @RequestMapping("/findAllByCategoryId")
    public List<xmcontent> findAllByCategoryId(@RequestParam Long categoryId);
}
