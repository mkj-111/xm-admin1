package com.jk.service.Impl;

import com.jk.entity.ColorBean;
import com.jk.mapper.ColorBeanMapper;
import com.jk.service.MkjColorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/6
 */
@Service
public class MkjColorServiceImpl implements MkjColorService {

    @Resource
    private ColorBeanMapper colorBeanMapper;


    @Override
    public List<ColorBean> findcolor(String goodsname) {
        return colorBeanMapper.findcolor(goodsname);
    }
}
