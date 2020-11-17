package com.jk.mapper;

import com.jk.entity.OrderGoods;
import com.jk.entity.TorderVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TorderMapper {
    List<TorderVo> highcharts();

    List<OrderGoods> findorder(@Param("userId") Integer userId);

    List<OrderGoods> findorder3(@Param("userId")Integer userId);

    List<OrderGoods> findorder4(@Param("userId")Integer userId);
}
