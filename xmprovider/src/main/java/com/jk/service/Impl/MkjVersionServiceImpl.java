package com.jk.service.Impl;

import com.jk.entity.VersionsBean;
import com.jk.mapper.VersionsBeanMapper;
import com.jk.service.MkjVersionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/6
 */
@Service
public class MkjVersionServiceImpl implements MkjVersionService {


    @Resource
    private VersionsBeanMapper versionsBeanMapper;

    @Override
    public List<VersionsBean> findversion(Integer colorid) {
        return versionsBeanMapper.findversion(colorid);
    }

    @Override
    public VersionsBean findversionsId(Integer versionsId) {
        return versionsBeanMapper.findversionsId(versionsId);
    }
}
