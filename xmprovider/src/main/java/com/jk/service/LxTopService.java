package com.jk.service;


import com.jk.entity.GoodsBeab;

import java.util.List;

/**
 *  @author: 李新
 *  @Date: 2020/11/4 20:26
 *  @Description:
 *  励志：一giao窝里giao giao
 */
public interface LxTopService {
    List<GoodsBeab> queryTopList(String topName, Integer type);
}
