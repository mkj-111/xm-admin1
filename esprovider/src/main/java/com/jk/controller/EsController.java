package com.jk.controller;

import com.jk.entity.Goods;
import com.jk.service.EsService;
import com.jk.service.GoodsService;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/10
 */
@RestController
public class EsController {

    @Resource
    private GoodsService goodsService;

    @Resource
    private EsService esService;

    @Resource
    private ElasticsearchTemplate esTemplate;

    @RequestMapping("highlight")
    public List<Goods> highlight(String name){
        Client client = esTemplate.getClient();
        SearchRequestBuilder srb = client.prepareSearch("2004_aa")
                .setTypes("type")
                .setQuery(QueryBuilders.matchQuery("goodsName",name))
                .addSort("id", SortOrder.ASC)
                .setFrom(0)
                .setSize(20);
        // 获取高亮对象
        HighlightBuilder highlightBuilder = new HighlightBuilder();
        highlightBuilder.field("goodsName");

        // 将高亮对象放入查询对象中
        srb.highlighter(highlightBuilder);

        // 获取查询返回的对象
        SearchResponse sr = srb.get();

        // 通过SearchResponse对象获取命中的结果集
        SearchHits hits = sr.getHits();

        // 命中的结果集获取iterator迭代器
        Iterator<SearchHit> iterator = hits.iterator();

        List<Goods> userList = new ArrayList<>();
        while (iterator.hasNext()) {
            Goods user = new Goods();
            SearchHit sh = iterator.next();
            Map<String, HighlightField> hf = sh.getHighlightFields();
            Map<String, Object> sourceAsMap = sh.getSourceAsMap();

            user.setId(Integer.valueOf(sourceAsMap.get("id").toString()));
            user.setGoodsName(hf.get("goodsName").getFragments()[0].toString());
            user.setGoodsPrice((Long) sourceAsMap.get("price"));
            user.setGoodsInfo(sourceAsMap.get("goodsInfo").toString());
            user.setGoodsColorId(sourceAsMap.get("goodsColorId").toString());
            user.setGoodsTypeid(Integer.valueOf(sourceAsMap.get("goodsTypeid").toString()));

            userList.add(user);
        }

        System.out.println(userList);
        return userList;
    }


    public void add(){
        /*UserEntity user = new UserEntity();
        user.setUserId(6);
        user.setUserName("李新2");
        user.setPassword("111");
        user.setCreateTime("2020-11-06");
        esService.save(user);*/

        List<Goods> goods = goodsService.findall();
        for (Goods good :goods) {
            esService.save(good);
        }

    }

}
