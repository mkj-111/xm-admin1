package com.jk.service.Impl;

import com.jk.entity.OrderGoods;
import com.jk.mapper.WebLogMapper;
import com.jk.service.WebLogService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class WebLogServiceImpl implements WebLogService {
    @Resource
    private WebLogMapper webLogMapper;
    @Override
    @GlobalTransactional
    public void insertOrderGoods(OrderGoods orderGoods) {
        orderGoods.setPayType("支付宝");
        webLogMapper.insertOrderGoods(orderGoods);
    }

    @Override
    public void delNum(String goodsId, String orderNum) {
        webLogMapper.delNum(goodsId,orderNum);
    }

    @Override
    public void delMoney(Integer userId, BigDecimal orderSumPrice) {
        webLogMapper.delMoney(userId,orderSumPrice);
    }
}
