package com.jk.service;

import com.jk.entity.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/10
 */
@Repository
public interface EsService extends ElasticsearchCrudRepository<Goods,Integer> {
}
