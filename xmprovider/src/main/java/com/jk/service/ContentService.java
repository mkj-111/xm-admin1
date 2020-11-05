package com.jk.service;

import com.jk.entity.xmcontent;

import java.util.List;


public interface ContentService {

	/**
	 * 通过广告类型查询对应的广告集合
	 * @param categoryId
	 * @return
	 */
	public List<xmcontent> findAllByCategoryId(Long categoryId);
}
