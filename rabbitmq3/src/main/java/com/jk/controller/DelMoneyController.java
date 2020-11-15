package com.jk.controller;

import com.jk.service.DelMoneyServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class DelMoneyController {
  @Autowired
  private DelMoneyServcie delMoneyServcie;

  @RequestMapping("/delMoney")
  public void delMoney(@RequestParam Integer userId, @RequestParam BigDecimal orderSumPrice){

    delMoneyServcie.delMoney(userId,orderSumPrice);
  }


}
