package com.jk.service;

import com.jk.entity.xmcontent;

import java.util.List;

public interface ContentService {
    public List<xmcontent> findAllByCategoryId( Long categoryId);
}
