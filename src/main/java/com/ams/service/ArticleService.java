package com.ams.service;

import java.util.List;

import com.ams.dto.ArticleDTO;

public interface ArticleService {

	ArticleDTO getArticles(long userId, long categoryId, long articleId);

	List<ArticleDTO> getArticles(long userId, long categoryId);

	List<ArticleDTO> getArticles(long userId);

	long postArticle(long userId, long categoryId, ArticleDTO article);

	void updateArticle(long userId, long articleId, ArticleDTO article);

	void deleteArticle(long articleId);

}
