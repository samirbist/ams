package com.ams.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ams.service.ArticleService;
import com.ams.dto.ArticleDTO;

@RestController
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	@GetMapping("/users/{userId}/categories/{categoryId}/articles/{articleId}")
	public ArticleDTO getArticles(@PathVariable("userId") long userId, @PathVariable("categoryId") long categoryId,
			@PathVariable("articleId") long articleId) {

		ArticleDTO articleDto = articleService.getArticles(userId, categoryId, articleId);
		return articleDto;
	}

	@GetMapping("/users/{userId}/categories/{categoryId}/articles")
	public List<ArticleDTO> getArticles(@PathVariable("userId") long userId,
			@PathVariable("categoryId") long categoryId) {
		List<ArticleDTO> list = articleService.getArticles(userId, categoryId);
		return list;
	}

	@GetMapping("/users/{userId}/articles")
	public List<ArticleDTO> getArticles(@PathVariable("userId") long userId) {
		List<ArticleDTO> list = articleService.getArticles(userId);
		return list;
	}

	@PostMapping("/users/{userId}/categories/{categoryId}/articles")
	public long postArticle(@PathVariable("userId") long userId, @PathVariable("categoryId") long categoryId,
			@RequestBody ArticleDTO article) {
		long articleId = articleService.postArticle(userId, categoryId, article);
		return articleId;
	}

	@PutMapping("/users/{userId}/articles/{articleId}")
	public String updateArticle(@PathVariable("userId") long userId, @PathVariable("articleId") long articleId,
			@RequestBody ArticleDTO article) {
		articleService.updateArticle(userId, articleId, article);
		return "Welcome to RestTemplate Example.";
	}

	@DeleteMapping("/users/{userId}/articles/{articleId}")
	public String deleteArticle(@PathVariable("userId") long userId, @PathVariable("articleId") long articleId) {
		articleService.deleteArticle(articleId);
		return "Welcome to RestTemplate Example.";
	}
}
