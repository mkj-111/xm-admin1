package com.jk.service;

import com.jk.entity.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/12
 */
@FeignClient("es")
public interface EsService {

    @RequestMapping("highlight")
    public List<Goods> highlight(@RequestParam String name);

}
