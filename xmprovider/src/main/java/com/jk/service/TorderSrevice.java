package com.jk.service;

import com.jk.entity.OrderGoods;
import com.jk.entity.TorderVo;

import java.util.List;

public interface TorderSrevice {

    List<TorderVo> highcharts();


    List<OrderGoods> findorder(Integer userId);

    List<OrderGoods> findorder3(Integer userId);

    List<OrderGoods> findorder4(Integer userId);

    List<OrderGoods> findorder5(Integer userId);

    void updateorder(Integer id);

    void deleteorder(Integer id);
}
