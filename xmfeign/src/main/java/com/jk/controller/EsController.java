package com.jk.controller;

import com.jk.entity.Goods;
import com.jk.service.EsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 毛康健
 * @description es
 * @create 2020/11/12
 */
@RestController
@RequestMapping("es")
public class EsController {


    @Resource
    private EsService esService;

    @RequestMapping("highlight")
    public List<String> highlight(String name){

        return esService.selectbyname(name);
    }
    @RequestMapping("highlight2")
    public List<Goods> highlight2(String name){

        return esService.highlight(name);
    }


    @RequestMapping("highlight1")
    public List<Goods> highlight1(HttpSession session){

        String name = (String) session.getAttribute("name");

        return esService.highlight(name);
    }

}
