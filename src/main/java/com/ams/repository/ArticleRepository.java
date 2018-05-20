package com.ams.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.db.entity.Article;

public interface ArticleRepository  extends JpaRepository<Article, Long>{

	

}

