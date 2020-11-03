package com.jk.service.Impl;

import com.jk.entity.TypetreeBean;
import com.jk.mapper.TypetreeBeanMapper;
import com.jk.service.TypetreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/3
 */
@Service
public class TypetreeServiceImpl implements TypetreeService {

    @Autowired
    private TypetreeBeanMapper typetreeBeanMapper;


    @Override
    public List<TypetreeBean> findtype(Integer pid) {
        return typetreeBeanMapper.findtype(pid);
    }
}
