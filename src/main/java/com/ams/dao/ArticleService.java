package com.ams.dao;

import java.util.List;

import com.ams.dto.ArticleDto;

public interface ArticleService {

	ArticleDto getArticles(long userId, long categoryId, long articleId);

	List<ArticleDto> getArticles(long userId, long categoryId);

	List<ArticleDto> getArticles(long userId);

	long postArticle(long userId, long categoryId, ArticleDto article);

	void updateArticle(long userId, long articleId, ArticleDto article);

	void deleteArticle(long articleId);

}
