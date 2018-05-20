package com.ams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.dto.CategoryDTO;
import com.ams.repository.CategoryRepository;
import com.ams.repository.UserRepository;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private UserRepository userDAO;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public CategoryDTO getCategory(long userId, long categoryId) {

		
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
