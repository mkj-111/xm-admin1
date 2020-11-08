package com.jk.service;

import com.jk.entity.ColorBean;

import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/6
 */
public interface MkjColorService {
    List<ColorBean> findcolor(String goodsname);
}
