package com.ams.dto;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class CategoryDTO {
	
	private long categoryId;
	private String categoryNumber;
	private Date publishingDate;
	private CategoryDTO parentCategory;
	private String descriptionTXT;
	
	private String cagtShrtNM;

	private Set<ArticleDTO> articleCategorys = new HashSet<ArticleDTO>();


	
	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
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

	public CategoryDTO getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(CategoryDTO parentCategory) {
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

	public Set<ArticleDTO> getArticleCategorys() {
		return articleCategorys;
	}

	public void setArticleCategorys(Set<ArticleDTO> articleCategorys) {
		this.articleCategorys = articleCategorys;
	}

	@Override
	public String toString() {
		return "CategoryDto [categoryId=" + categoryId + ", categoryNumber=" + categoryNumber + ", publishingDate="
				+ publishingDate + ", parentCategory=" + parentCategory + ", descriptionTXT=" + descriptionTXT
				+ ", cagtShrtNM=" + cagtShrtNM + ", articleCategorys=" + articleCategorys + "]";
	}
	
	
	

}
