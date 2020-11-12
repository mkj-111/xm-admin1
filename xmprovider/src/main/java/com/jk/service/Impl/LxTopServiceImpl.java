package com.jk.service.Impl;

import com.jk.entity.GoodsBeab;
import com.jk.entity.HuiFuBean;
import com.jk.entity.PingLunBean;
import com.jk.mapper.LxTopMapper;
import com.jk.service.LxTopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 *  @author: 李新
 *  @Date: 2020/11/4 20:26
 *  @Description:
 *  励志：一giao窝里giao giao
 */
@Service
public class LxTopServiceImpl implements LxTopService {

    @Resource
    private LxTopMapper lxTopMapper;

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public List<GoodsBeab> queryTopList(String topName, Integer type) {
        GoodsBeab goodsBeab = new GoodsBeab();
        goodsBeab.setGoodsname(topName);
        goodsBeab.setGoodstypeid(type);
        return lxTopMapper.queryTopList(goodsBeab);
    }

    //查询评论
    @Override
    public List<PingLunBean> findPingLunId(Integer ids) {
        Query query = new Query(Criteria.where("goodsId").is(ids));
        List<PingLunBean> pingLunBeans = mongoTemplate.find(query, PingLunBean.class);
        return pingLunBeans;
    }
    //新增评论
    @Override
    public void addPingLun(PingLunBean pingLunBean) {
        mongoTemplate.save(pingLunBean);
    }

    @Override
    public void updateDianZan(Integer dian,String id) {
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = new Update().set("dianzan",dian);
        mongoTemplate.upsert(query,update,PingLunBean.class);
    }

    //回复
    @Override
    public void insertHuiFu(HuiFuBean huiFuBean) {
        mongoTemplate.save(huiFuBean);
    }

    //回复列表查询
    @Override
    public List<HuiFuBean> queryHuiFu(String pid) {
        Query query = new Query(Criteria.where("pinglunId").is(pid));
        List<HuiFuBean> huiFuBeans = mongoTemplate.find(query, HuiFuBean.class);
        return huiFuBeans;
    }
}
