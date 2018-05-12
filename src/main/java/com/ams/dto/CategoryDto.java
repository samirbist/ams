package com.ams.dto;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class CategoryDto {
	
	private long CATG_ID;
	private String categoryNumber;
	private Date publishingDate;
	private CategoryDto parentCategory;
	private String descriptionTXT;
	
	private String cagtShrtNM;

	private Set<ArticleDto> articleCategorys = new HashSet<ArticleDto>();

	public long getCATG_ID() {
		return CATG_ID;
	}

	public void setCATG_ID(long cATG_ID) {
		CATG_ID = cATG_ID;
	}

	public String getCategoryNumber() {
		return categoryNumber;
	}

	public void setCategoryNumber(String categoryNumber) {
		this.categoryNumber = categoryNumber;
	}

	public Date getPublishingDate() {
		return publishingDate;
	}

	public void setPublishingDate(Date publishingDate) {
		this.publishingDate = publishingDate;
	}

	public CategoryDto getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(CategoryDto parentCategory) {
		this.parentCategory = parentCategory;
	}

	public String getDescriptionTXT() {
		return descriptionTXT;
	}

	public void setDescriptionTXT(String descriptionTXT) {
		this.descriptionTXT = descriptionTXT;
	}

	public String getCagtShrtNM() {
		return cagtShrtNM;
	}

	public void setCagtShrtNM(String cagtShrtNM) {
		this.cagtShrtNM = cagtShrtNM;
	}

	public Set<ArticleDto> getArticleCategorys() {
		return articleCategorys;
	}

	public void setArticleCategorys(Set<ArticleDto> articleCategorys) {
		this.articleCategorys = articleCategorys;
	}
	
	
	

}
