package com.jk.service;

import com.jk.mapper.DelNumMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.config.GlobalChannelInterceptor;
import org.springframework.stereotype.Service;

@Service
public class DelNumServcieImpl implements DelNumServcie{


      @Autowired
      private DelNumMapper delNumMapper;

      @GlobalTransactional
      @Override
      public void delNum(String goodsId, String goodsNum) {
            delNumMapper.delNum(goodsId,goodsNum);
      }
}
