package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient("rabbitmq2")
public interface DelNumService {
    @RequestMapping("/delNum")
    public void delNum(@RequestParam String goodsId, @RequestParam String goodsNum);
}
