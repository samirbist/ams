package com.ams.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ams.service.CategoryService;
import com.ams.dto.CategoryDTO;

public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/user/{userId}/category/{categoryId}")
	public CategoryDTO getUser(@PathVariable("userId") long userId,@PathVariable("categoryId") long categoryId) {
	CategoryDTO category = categoryService.getCategory(userId, categoryId);
      return category;
	}
	
	
	@PostMapping(value = "/user/{userId}/category")
	public long addCategory(@PathVariable("userId") long userId, @RequestBody CategoryDTO category) {
      long id  = categoryService.addCategory( userId, category);
      return id;
	}
	
	
	@PutMapping( "/category/{categoryId}")
	public String updateCategory(@PathVariable("categoryId") long categoryId,@RequestBody  CategoryDTO category) {
		categoryService.updateCategory( categoryId,category);
      return "Success";
	}
	
	
	@DeleteMapping("/category/{categoryId}")
	public String deleteCategory(@PathVariable("categoryId") long categoryId) {
		categoryService.deleteCategory( categoryId);
      return "Success";
	}
}
