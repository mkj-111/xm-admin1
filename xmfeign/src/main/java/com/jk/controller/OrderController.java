package com.jk.controller;

import com.jk.entity.*;
import com.jk.pojo.RedisConstant;
import com.jk.service.OldPeopleService;
import com.jk.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Collation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private MongoTemplate mongoTemplate;


    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private OldPeopleService oldPeopleService;


    @RequestMapping("/orderList")
    public String Order_hrefList() {

        return "admin/order_href";
    }

    @RequestMapping("/findAddress")
    @ResponseBody
    public List<Address> findAddress(HttpSession session) {
        xmuser user = (xmuser) session.getAttribute("user");
        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(user.getUserId()));
        List<Address> list = mongoTemplate.find(query, Address.class);
        return list;
    }


    @RequestMapping("/addAddress")
    @ResponseBody
    public void addAddress(Address address, HttpSession session) {
        TbProvinces tbProvinces = oldPeopleService.findsheng(address.getShengId());
        TbCities tbCities = oldPeopleService.findshier(address.getShiId());
        TbAreas tbAreas = oldPeopleService.findxianer(address.getXianId());
        address.setSheng(tbProvinces.getProvince());
        address.setShi(tbCities.getCity());
        address.setXian(tbAreas.getArea());
        xmuser user = (xmuser) session.getAttribute("user");
        address.setUserId(user.getUserId());
        mongoTemplate.save(address);
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Address findById(String id) {
        return mongoTemplate.findById(id, Address.class);
    }


    @RequestMapping("/findGoods")
    @ResponseBody
    public List<Goods> findGoods(HttpSession session) {
        xmuser user = (xmuser) session.getAttribute("user");
        List<Goods> goodsList = (List<Goods>) redisUtil.get(RedisConstant.GOODS_LIST_KEY + "___" + user.getUserId().toString());
        System.out.println("--------------------" + goodsList);
        return goodsList;
    }

}
