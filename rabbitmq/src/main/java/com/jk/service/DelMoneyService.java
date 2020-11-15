package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.math.BigDecimal;
@FeignClient("rabbitmq3")
public interface DelMoneyService {
    @RequestMapping("/delMoney")
    public void delMoney(@RequestParam Integer userId, @RequestParam BigDecimal orderSumPrice);
}
