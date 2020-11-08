package com.jk.service;

import com.jk.entity.VersionsBean;

import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/6
 */
public interface MkjVersionService {
    List<VersionsBean> findversion(Integer colorid);

    VersionsBean findversionsId(Integer versionsId);
}
