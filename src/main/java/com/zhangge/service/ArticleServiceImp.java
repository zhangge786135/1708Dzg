package com.zhangge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangge.entity.Article;
import com.zhangge.mapper.ArticleMapper;

@Service
public class ArticleServiceImp implements ArticleService {

	@Autowired
	private ArticleMapper articleMapper;

	@Override
	public List<Article> queryArticle() {
		// TODO Auto-generated method stub
		return articleMapper.queryArticle();
	}

}
