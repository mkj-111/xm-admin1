package com.jk.service;

import com.jk.entity.ColorBean;
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
public interface MkjColorService {


    @RequestMapping("findcolor")
    public List<ColorBean>findcolor(@RequestParam String goodsname);
}
