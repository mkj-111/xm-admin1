package com.jk.controller;

import com.jk.entity.TypetreeBean;
import com.jk.service.TypetreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 毛康健
 * @description 类型自联查
 * @create 2020/11/3
 */
@RestController
public class TypetreeController {


    @Autowired
    private TypetreeService typetreeService;

    //查询分类导航
    @RequestMapping("findtype")
    public List<TypetreeBean> findtype(@RequestParam Integer pid) {
        return typetreeService.findtype(pid);
    }

}
