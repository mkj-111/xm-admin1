package com.jk.service.Impl;

import com.jk.entity.TbAreas;
import com.jk.entity.TbCities;
import com.jk.entity.TbProvinces;
import com.jk.mapper.OldPeopleMapper;
import com.jk.service.OldPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OldPeopleServiceImpl implements OldPeopleService {

    @Autowired
    private OldPeopleMapper oldPeopleMapper;

    @Override
    public List<TbProvinces> getSheng() {
        return oldPeopleMapper.getSheng();
    }

    @Override
    public List<TbCities> findShi(String provinceid) {
        return oldPeopleMapper.findShi(provinceid);
    }

    @Override
    public List<TbAreas> findXian(String cityid) {
        return oldPeopleMapper.findXian(cityid);
    }

    @Override
    public TbProvinces findsheng(String shengId) {
        return oldPeopleMapper.findsheng(shengId);
    }

    @Override
    public TbCities findshier(String shiId) {
        return oldPeopleMapper.findshier(shiId);
    }

    @Override
    public TbAreas findxianer(String xianId) {
        return oldPeopleMapper.findxianer(xianId);
    }
}
