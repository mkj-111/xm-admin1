package com.jk.service.Impl;

import com.jk.entity.TorderVo;
import com.jk.mapper.TorderMapper;
import com.jk.service.TorderSrevice;
import org.checkerframework.checker.units.qual.A;
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
}
