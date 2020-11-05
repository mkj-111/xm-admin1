package com.jk.service;

import com.jk.entity.TypetreeBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/3
 */
@FeignClient(value = "xmprovider")
public interface TypetreeService {

    @RequestMapping("findtype")
    public List<TypetreeBean>findtype(@RequestParam Integer pid);
}
