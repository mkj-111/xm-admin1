package com.jk.service.Impl;

import com.jk.entity.GoodsBeab;
import com.jk.mapper.LxTopMapper;
import com.jk.service.LxTopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 *  @author: 李新
 *  @Date: 2020/11/4 20:26
 *  @Description:
 *  励志：一giao窝里giao giao
 */
@Service
public class LxTopServiceImpl implements LxTopService {
    @Autowired
    private LxTopMapper lxTopMapper;

    @Override
    public List<GoodsBeab> queryTopList(String topName, Integer type) {
        GoodsBeab goodsBeab = new GoodsBeab();
        goodsBeab.setGoodsname(topName);
        goodsBeab.setGoodstypeid(type);
        return lxTopMapper.queryTopList(goodsBeab);
    }
}
