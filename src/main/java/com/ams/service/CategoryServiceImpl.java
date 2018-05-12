package com.ams.service;

import org.springframework.stereotype.Service;

import com.ams.dto.CategoryDTO;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Override
	public CategoryDTO getCategory(long userId, long categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long addCategory(long userId, CategoryDTO category) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateCategory(long categoryId, CategoryDTO category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategory(long categoryId) {
		// TODO Auto-generated method stub
		
	}

}
