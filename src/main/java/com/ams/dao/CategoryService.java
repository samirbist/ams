package com.ams.dao;

import com.ams.dto.CategoryDto;

public interface CategoryService {

	CategoryDto getCategory(long userId, long categoryId);

	long addCategory(long userId, CategoryDto category);

	void updateCategory(long categoryId, CategoryDto category);

	void deleteCategory(long categoryId);


}
