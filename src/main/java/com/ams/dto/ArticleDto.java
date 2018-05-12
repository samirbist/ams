package com.ams.dto;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class ArticleDto {
	
	
	private long artclID;
	private String headLine;
	private String brief;
	private Date publishingDate;
	private String shortHeadline;
	private String keywords;
	private UserDto user;

	private Set<CategoryDto> articleCategorys = new HashSet<CategoryDto>();

	public long getArtclID() {
		return artclID;
	}

	public void setArtclID(long artclID) {
		this.artclID = artclID;
	}

	public String getHeadLine() {
		return headLine;
	}

	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public Date getPublishingDate() {
		return publishingDate;
	}

	public void setPublishingDate(Date publishingDate) {
		this.publishingDate = publishingDate;
	}

	public String getShortHeadline() {
		return shortHeadline;
	}

	public void setShortHeadline(String shortHeadline) {
		this.shortHeadline = shortHeadline;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public Set<CategoryDto> getArticleCategorys() {
		return articleCategorys;
	}

	public void setArticleCategorys(Set<CategoryDto> articleCategorys) {
		this.articleCategorys = articleCategorys;
	}
	
	
	

}
