package com.jk.service.Impl;

import com.jk.entity.xmcontent;
import com.jk.mapper.xmcontentMapper;
import com.jk.service.ContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/5
 */
@Service
public class ContentServiceImpl implements ContentService {

    @Resource
    private xmcontentMapper xmcontentMapper;


    @Override
    public List<xmcontent> findAllByCategoryId(Long categoryId) {
        return xmcontentMapper.findAllByCategoryId(categoryId);
    }
}
