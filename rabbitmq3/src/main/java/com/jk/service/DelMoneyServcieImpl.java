package com.jk.service;

import com.jk.mapper.DelMoneyMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DelMoneyServcieImpl implements DelMoneyServcie {
      @Autowired
      private DelMoneyMapper delMoneyMapper;

      @GlobalTransactional
      @Override
      public void delMoney(Integer userId, BigDecimal orderSumPrice) {
            delMoneyMapper.delMoney(userId,orderSumPrice);
      }
}
