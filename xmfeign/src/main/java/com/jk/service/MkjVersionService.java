package com.jk.service;

import com.jk.entity.VersionsBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/6
 */
@FeignClient("xmprovider")
public interface MkjVersionService {

    @RequestMapping("findversion")
    public List<VersionsBean> findversion(@RequestParam Integer colorid);

    @RequestMapping("findversionsId")
    public VersionsBean findversionsId(@RequestParam Integer versionsId);

}
