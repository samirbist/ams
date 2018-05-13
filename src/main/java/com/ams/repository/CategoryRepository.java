package com.ams.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.db.entity.Article;
import com.ams.db.entity.Category;
import com.ams.db.entity.User;
import com.ams.dto.CategoryDTO;

public interface CategoryRepository  extends JpaRepository<Category, Long>{

	
}
