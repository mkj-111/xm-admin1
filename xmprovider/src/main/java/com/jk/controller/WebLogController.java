package com.jk.controller;

import com.jk.entity.OrderGoods;
import com.jk.service.WebLogService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
public class WebLogController {
     @Resource
     private WebLogService webLogService;
    @RequestMapping("/insertOrderGoods")
    public void insertOrderGoods(@RequestBody OrderGoods orderGoods){

        webLogService.insertOrderGoods(orderGoods);
    }

    @RequestMapping("/delNum")
    public void delNum(@RequestParam String goodsId, @RequestParam String orderNum){

        webLogService.delNum(goodsId,orderNum);
    }

    @RequestMapping("/delMoney")
    public void delMoney(@RequestParam Integer userId,@RequestParam BigDecimal orderSumPrice){

        webLogService.delMoney(userId,orderSumPrice);
    }

}
