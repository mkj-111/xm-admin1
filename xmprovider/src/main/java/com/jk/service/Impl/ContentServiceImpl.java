package com.jk.service.Impl;

import java.util.List;

import com.jk.entity.xmcontent;
import com.jk.mapper.xmcontentMapper;
import com.jk.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;


@Service
public class ContentServiceImpl implements ContentService {
	
	@Autowired
	private com.jk.mapper.xmcontentMapper xmcontentMapper;
	
	@Autowired
	private RedisTemplate redisTemplate;

	public List<xmcontent> findAllByCategoryId(Long categoryId) {
		return xmcontentMapper.findAllByCategoryId(categoryId);
	}

}
