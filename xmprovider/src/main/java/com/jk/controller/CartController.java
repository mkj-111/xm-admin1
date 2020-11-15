package com.jk.controller;

import com.jk.entity.Goods;
import com.jk.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private CartService carService;

    @RequestMapping("/search_success")
    public List<Goods> findGoods(@RequestParam Integer id) {

        return carService.findGoods(id);
    }

}
