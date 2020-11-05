package com.jk.controller;

import java.util.List;

import com.jk.entity.xmcontent;
import com.jk.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ContentController {

	@Autowired
	private ContentService contentService;
	
	@RequestMapping("findAllByCategoryId")
	public List<xmcontent> findAllByCategoryId(@RequestParam Long categoryId) {

		return contentService.findAllByCategoryId(categoryId);
	}
}
