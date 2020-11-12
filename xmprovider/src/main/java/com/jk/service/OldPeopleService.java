package com.jk.service;

import com.jk.entity.TbAreas;
import com.jk.entity.TbCities;
import com.jk.entity.TbProvinces;

import java.util.List;

public interface OldPeopleService {
    List<TbProvinces> getSheng();

    List<TbCities> findShi(String provinceid);

    List<TbAreas> findXian(String cityid);

    TbProvinces findsheng(String shengId);

    TbCities findshier(String shiId);

    TbAreas findxianer(String xianId);
}
