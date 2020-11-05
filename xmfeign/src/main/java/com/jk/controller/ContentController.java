package com.jk.controller;

import com.jk.entity.xmcontent;
import com.jk.service.ContentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("con")
public class ContentController {
@Resource
    private ContentService contentService;


    @RequestMapping("findAllByCategoryId")
    @ResponseBody
public List<xmcontent> findAllByCategoryId(Long categoryId) {

    return contentService.findAllByCategoryId(categoryId);
}

}
