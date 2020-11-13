package com.jk.service;

import com.jk.entity.OrderGoods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient("xmprovider")
public interface WebLogService {
    @RequestMapping("/insertOrderGoods")
    public void insertOrderGoods(@RequestBody OrderGoods orderGoods);

    @RequestMapping("/delNum")
    public void delNum(@RequestParam String goodsId,@RequestParam String orderNum);

    @RequestMapping("/delMoney")
    public void delMoney(@RequestParam Integer userId,@RequestParam BigDecimal orderSumPrice);
}
