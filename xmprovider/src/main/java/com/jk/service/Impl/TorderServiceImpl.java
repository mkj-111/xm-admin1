package com.jk.service.Impl;

import com.jk.entity.OrderGoods;
import com.jk.entity.TorderVo;
import com.jk.mapper.TorderMapper;
import com.jk.service.TorderSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TorderServiceImpl implements TorderSrevice {
    @Autowired
    private TorderMapper torderMapper;

    @Override
    public List<TorderVo> highcharts() {

        return torderMapper.highcharts();
    }

    @Override
    public List<OrderGoods> findorder(Integer userId) {
        return torderMapper.findorder(userId);
    }

    @Override
    public List<OrderGoods> findorder3(Integer userId) {
        return torderMapper.findorder3(userId);
    }

    @Override
    public List<OrderGoods> findorder4(Integer userId) {
        return torderMapper.findorder4(userId);
    }

    @Override
    public List<OrderGoods> findorder5(Integer userId) {
        return torderMapper.findorder5(userId);
    }

    @Override
    public void updateorder(Integer id) {
         torderMapper.updateorder(id);
    }

    @Override
    public void deleteorder(Integer id) {
        torderMapper.deleteorder(id);
    }
}
