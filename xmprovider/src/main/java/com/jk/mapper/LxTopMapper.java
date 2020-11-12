package com.jk.mapper;

import com.jk.entity.GoodsBeab;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author: 李新
 * @Date: 2020/11/4 20:26
 * @Description: 励志：一giao窝里giao giao
 */
@Mapper
public interface LxTopMapper {
    List<GoodsBeab> queryTopList(@Param("goodsBeab") GoodsBeab goodsBeab);
}
