package com.jk.mapper;

import com.jk.entity.TbAreas;
import com.jk.entity.TbCities;
import com.jk.entity.TbProvinces;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OldPeopleMapper {
    @Select("select * from tb_provinces")
    List<TbProvinces> getSheng();

    @Select("select * from tb_cities where provinceid=#{provinceid}")
    List<TbCities> findShi(String provinceid);

    @Select("select * from tb_areas where cityid=#{cityid}")
    List<TbAreas> findXian(String cityid);

    @Select("select * from tb_provinces where provinceid=#{shengId}")
    TbProvinces findsheng(String shengId);

    @Select("select * from tb_cities where cityid=#{shiId}")
    TbCities findshier(String shiId);

    @Select("select * from tb_areas where areaid=#{xianId}")
    TbAreas findxianer(String xianId);
}
