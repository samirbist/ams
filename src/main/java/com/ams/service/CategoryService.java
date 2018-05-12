package com.ams.service;

import com.ams.dto.CategoryDTO;

public interface CategoryService {

	CategoryDTO getCategory(long userId, long categoryId);

	long addCategory(long userId, CategoryDTO category);

	void updateCategory(long categoryId, CategoryDTO category);

	void deleteCategory(long categoryId);

}
