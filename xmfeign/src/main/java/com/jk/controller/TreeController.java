package com.jk.controller;

import com.jk.entity.xmtree;
import com.jk.service.TreeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("tree")
public class TreeController {

    @Resource
    private TreeService treeService;

    @RequestMapping("findtree")
    @ResponseBody
    public List<xmtree> findtree() {
        return treeService.findtree();
    }

}
