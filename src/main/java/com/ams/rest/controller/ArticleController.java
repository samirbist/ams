package com.ams.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ams.dao.ArticleService;
import com.ams.dto.ArticleDto;

@RestController
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	@RequestMapping(value = "/users/{userId}/categories/{categoryId}/articles/{articleId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ArticleDto getArticles(@PathVariable("userId") long userId,
			@PathVariable("categoryId") long categoryId, @PathVariable("articleId") long articleId) {

		ArticleDto articleDto = articleService.getArticles(userId, categoryId, articleId);
		return articleDto;
	}

	@RequestMapping(value = "/users/{userId}/categories/{categoryId}/articles", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ArticleDto> getArticles(@PathVariable("userId") long userId, @PathVariable("categoryId") long categoryId) {
		 List<ArticleDto> list = articleService.getArticles(userId, categoryId);
		return list;
	}

	@RequestMapping(value = "/users/{userId}/articles", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public  List<ArticleDto> getArticles(@PathVariable("userId") long userId) {
		 List<ArticleDto> list =	articleService.getArticles(userId);
		return list;
	}

	@RequestMapping(value = "/users/{userId}/categories/{categoryId}/articles", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public long postArticle(@PathVariable("userId") long userId, @PathVariable("categoryId") long categoryId,
			@RequestBody ArticleDto article) {
		long articleId = articleService.postArticle(userId, categoryId, article);
		return articleId;
	}

	@RequestMapping(value = "/users/{userId}/articles/{articleId}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateArticle(@PathVariable("userId") long userId, @PathVariable("articleId") long articleId,
			@RequestBody ArticleDto article) {
		articleService.updateArticle(userId, articleId, article);
		return "Welcome to RestTemplate Example.";
	}

	@RequestMapping(value = "/users/{userId}/articles/{articleId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteArticle(@PathVariable("userId") long userId, @PathVariable("articleId") long articleId) {
		articleService.deleteArticle(articleId);
		return "Welcome to RestTemplate Example.";
	}
}
