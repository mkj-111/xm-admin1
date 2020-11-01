package com.jk.controller;

import com.jk.entity.xmtree;
import com.jk.service.TreeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TreeController {

    @Resource
    private TreeService treeService;

    @RequestMapping("findtree")
    public List<xmtree> findtree(){
        return treeService.findtree();
    }
}
