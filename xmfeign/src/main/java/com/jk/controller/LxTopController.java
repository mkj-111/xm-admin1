package com.jk.controller;

import com.jk.entity.GoodsBeab;
import com.jk.entity.HuiFuBean;
import com.jk.entity.PingLunBean;
import com.jk.pojo.RedisConstant;
import com.jk.service.LxTopService;
import com.jk.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * @author: 李新
 * @Date: 2020/11/4 16:10
 * @Description: 励志：一giao窝里giao giao
 */
@Controller
@RequestMapping("top")
public class LxTopController {

    @Autowired
    private LxTopService lxTopService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("queryTopList")
    @ResponseBody
    public List<GoodsBeab> queryTopList(String topName, Integer type) {


        List<GoodsBeab> goodsBeabs = (List) redisUtil.get(RedisConstant.Goods_Key + "_" + type);
        if (goodsBeabs == null || goodsBeabs.isEmpty()) {
            goodsBeabs = lxTopService.queryTopList(topName, type);
            redisUtil.set(RedisConstant.Goods_Key + "_" + type, goodsBeabs);
            goodsBeabs = (List) redisUtil.get(RedisConstant.Tuijian_Key + "_" + type);
            if (goodsBeabs == null || goodsBeabs.isEmpty()) {
                goodsBeabs = lxTopService.queryTopList(topName, type);
                redisUtil.set(RedisConstant.Tuijian_Key + "_" + type, goodsBeabs);
                // 设置key的过期时间
                //redisUtil.expire(RedisConstant.USER_LIST_KEY + "_" + user, 60);
            }
        }
        return goodsBeabs;
    }
    @RequestMapping("queryTopGoodsInfoById")
    @ResponseBody
    public String queryTopGoodsInfoById(Integer id) {

        return "";
    }

    @RequestMapping("queryPingLun")
    @ResponseBody
    public List<PingLunBean> queryPingLun(String id){
        return lxTopService.queryPingLun(id);
    }
    //查询评论
    @RequestMapping("findPingLunId")
    @ResponseBody
    public List<PingLunBean> findPingLunId(HttpSession session){
        Integer ids = (Integer) session.getAttribute("ids");
        return lxTopService.findPingLunId(ids);
    }
    //新增评论
    @RequestMapping("addPingLun")
    @ResponseBody
    public void addPingLun(PingLunBean pingLunBean){
        lxTopService.addPingLun(pingLunBean);
    }

    //点赞
    @RequestMapping("updateDianZan")
    @ResponseBody
    public void updateDianZan(Integer dian,String id){
        lxTopService.updateDianZan(dian,id);
    }

    //回复
    @RequestMapping("insertHuiFu")
    @ResponseBody
    public void insertHuiFu(String huiInfo,String huifuId){
        lxTopService.insertHuiFu(huiInfo,huifuId);
    }
    @RequestMapping("queryHuiFu")
    @ResponseBody
    public List<HuiFuBean> queryHuiFu(String pid){
        return lxTopService.queryHuiFu(pid);
    }
}
