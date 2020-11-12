package com.jk.controller;

import com.jk.entity.Goods;
import com.jk.entity.xmuser;
import com.jk.pojo.RedisConstant;
import com.jk.service.CartService;
import com.jk.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CartController {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private CartService cartService;

    @RequestMapping("/insertCart")
    @ResponseBody
    public List<Goods> goodsList(HttpSession session) {
        xmuser userBean = (xmuser) session.getAttribute("user");
        Integer userId = userBean.getUserId();
        List<Goods> goodsList = (List<Goods>) redisUtil.get(RedisConstant.GOODS_LIST_KEY + "___" + userId.toString());
        System.out.println("-------------------------------------------------" + goodsList);
        return goodsList;
    }

    @RequestMapping("/search_add")
    public String search_add() {

        return "admin/search_add";
    }


    @RequestMapping("/deletegoods")
    @ResponseBody
    public void deletegoods(Integer id, Integer userId) {
        List<Goods> goodsList = (List<Goods>) redisUtil.get(RedisConstant.GOODS_LIST_KEY + "___" + userId.toString());

        for (int i = 0; i < goodsList.size(); i++) {
            if (goodsList.get(i).getId() == id) {
                goodsList.remove(i);
            }
        }
        //reids集合中原有的key删除
        redisUtil.del(RedisConstant.GOODS_LIST_KEY + "___" + userId.toString());
        //reids存入拼接的数据
        redisUtil.set(RedisConstant.GOODS_LIST_KEY + "___" + userId.toString(), goodsList);
    }


    @RequestMapping("/search_success")
    @ResponseBody
    public List<Goods> search_success(Integer versionId, Integer userId, String goodsName, Integer goodsprice) {
        List<Goods> goodsList = (List<Goods>) redisUtil.get(RedisConstant.GOODS_LIST_KEY + "___" + userId.toString());
        //为空时  加入第一件商品
        if (goodsList == null || goodsList.isEmpty()) {
            goodsList = cartService.findGoods(versionId, goodsName);
            for (Goods goods1 : goodsList) {
                goods1.setGoodsNum(1);
            }
            redisUtil.set(RedisConstant.GOODS_LIST_KEY + "___" + userId.toString(), goodsList);
            return goodsList;
        } else {//第二次存入相同的商品时
            //循环遍历集合
            int len = goodsList.size();
            for (int i = 0; i < len; i++) {
                if (goodsName.equals(goodsList.get(i).getGoodsName()) && versionId == goodsList.get(i).getGoodsVersionId()) {
                    System.out.println(goodsName);
                    System.out.println(goodsList.get(i).getGoodsName());
                    System.out.println(goodsList.get(i).getGoodsVersionId());
                    System.out.println(versionId);
                    goodsList.get(i).setGoodsNum(goodsList.get(i).getGoodsNum() + 1);

                    goodsList.get(i).setGoodsPrice(goodsList.get(i).getGoodsPrice() + goodsprice);
                    //reids集合中原有的key删除
                    redisUtil.del(RedisConstant.GOODS_LIST_KEY + "___" + userId.toString());
                    //reids存入拼接的数据
                    redisUtil.set(RedisConstant.GOODS_LIST_KEY + "___" + userId.toString(), goodsList);
                    return goodsList;
                } else if (goodsName.equals(goodsList.get(i).getGoodsName()) && versionId != goodsList.get(i).getGoodsVersionId()) {
                    System.out.println(goodsName);
                    System.out.println(goodsList.get(i).getGoodsName());
                    System.out.println(goodsList.get(i).getGoodsVersionId());
                    System.out.println(versionId);
                    //从数据库中查询第数据 get(0) 第一条数据
                    Goods goods = cartService.findGoods(versionId, goodsName).get(0);
                    goods.setGoodsNum(1);
                    //reids集合中拼接查询的数据
                    goodsList.add(goods);
                    //reids集合中原有的key删除
                    redisUtil.del(RedisConstant.GOODS_LIST_KEY + "___" + userId.toString());
                    //reids存入拼接的数据
                    redisUtil.set(RedisConstant.GOODS_LIST_KEY + "___" + userId.toString(), goodsList);
                    return goodsList;
                }
            }
            //从数据库中查询第数据 get(0) 第一条数据
            Goods goods = cartService.findGoods(versionId, goodsName).get(0);
            goods.setGoodsNum(1);
            //reids集合中拼接查询的数据
            goodsList.add(goods);
            //reids集合中原有的key删除
            redisUtil.del(RedisConstant.GOODS_LIST_KEY + "___" + userId.toString());
            //reids存入拼接的数据
            redisUtil.set(RedisConstant.GOODS_LIST_KEY + "___" + userId.toString(), goodsList);
            return goodsList;
        }
    }


}
