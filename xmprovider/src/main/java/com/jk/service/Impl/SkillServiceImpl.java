package com.jk.service.Impl;

import com.jk.entity.SkillBean;
import com.jk.mapper.SkillBeanMapper;
import com.jk.service.SkillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/4
 */
@Service
public class SkillServiceImpl implements SkillService {

    @Resource
    private SkillBeanMapper skillBeanMapper;


    @Override
    public List<SkillBean> findskill() {
        return skillBeanMapper.findskill();
    }
}
