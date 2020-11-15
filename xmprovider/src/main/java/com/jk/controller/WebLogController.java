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




}
