package com.ams.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ams.dto.ArticleDTO;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Override
	public ArticleDTO getArticles(long userId, long categoryId, long articleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArticleDTO> getArticles(long userId, long categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArticleDTO> getArticles(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long postArticle(long userId, long categoryId, ArticleDTO article) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateArticle(long userId, long articleId, ArticleDTO article) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteArticle(long articleId) {
		// TODO Auto-generated method stub
		
	}

}
