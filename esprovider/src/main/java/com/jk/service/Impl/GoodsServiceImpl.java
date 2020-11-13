package com.jk.service.Impl;

import com.jk.entity.Goods;
import com.jk.mapper.GoodsMapper1;
import com.jk.service.GoodsService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/11
 */
@Service
public class GoodsServiceImpl implements GoodsService {


    @Resource
    private GoodsMapper1 goodsMapper;


    @Override
    public List<Goods> findall() {
        return goodsMapper.findall();
    }
}
