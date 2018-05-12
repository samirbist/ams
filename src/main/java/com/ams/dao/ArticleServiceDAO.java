package com.ams.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.db.entity.Article;
import com.ams.db.entity.User;
import com.ams.dto.ArticleDTO;

public interface ArticleServiceDAO  extends JpaRepository<Article, Long>{

	

}

