package com.ams.dao;

import java.util.List;

import com.ams.dto.ArticleDto;

public class ArticleServiceDAO implements ArticleService {

	@Override
	public ArticleDto getArticles(long userId, long categoryId, long articleId) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ArticleDto> getArticles(long userId, long categoryId) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ArticleDto> getArticles(long userId) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public long postArticle(long userId, long categoryId, ArticleDto article) {
		return categoryId;
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void updateArticle(long userId, long articleId, ArticleDto article) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteArticle(long articleId) {
		// TODO Auto-generated method stub
		
	}

}
