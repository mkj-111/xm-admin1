package com.jk.controller;

import com.jk.service.DelNumServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DelNumController {
  @Autowired
  private DelNumServcie delNumServcie;

  @RequestMapping("/delNum")
  public void delNum(@RequestParam String goodsId, @RequestParam String goodsNum){

    delNumServcie.delNum(goodsId,goodsNum);
  }

}
