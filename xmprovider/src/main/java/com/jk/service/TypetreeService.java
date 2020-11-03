package com.jk.service;

import com.jk.entity.TypetreeBean;

import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/3
 */
public interface TypetreeService {
    List<TypetreeBean> findtype(Integer pid);
}
