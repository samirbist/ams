package com.ams.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ams.dao.CategoryService;
import com.ams.dto.CategoryDto;

public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/user/{userId}/category/{categoryId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public CategoryDto getUser(@PathVariable("userId") long userId,@PathVariable("categoryId") long categoryId) {
	CategoryDto category = categoryService.getCategory(userId, categoryId);
      return category;
	}
	
	
	@RequestMapping(value = "/user/{userId}/category", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public long addCategory(@PathVariable("userId") long userId, @RequestBody CategoryDto category) {
      long id  = categoryService.addCategory( userId, category);
      return id;
	}
	
	
	@RequestMapping(value = "/category/{categoryId}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateCategory(@PathVariable("categoryId") long categoryId,@RequestBody  CategoryDto category) {
		categoryService.updateCategory( categoryId,category);
      return "Success";
	}
	
	
	@RequestMapping(value = "/category/{categoryId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteCategory(@PathVariable("categoryId") long categoryId) {
		categoryService.deleteCategory( categoryId);
      return "Success";
	}
}
