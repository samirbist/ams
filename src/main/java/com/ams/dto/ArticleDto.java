package com.ams.dto;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class ArticleDTO {
	
	
	private long artclID;
	private String headLine;
	private String brief;
	private Date publishingDate;
	private String shortHeadline;
	private String keywords;
	private UserDTO user;

	private Set<CategoryDTO> articleCategorys = new HashSet<CategoryDTO>();
	
	public ArticleDTO() {
		
	}

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

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public Set<CategoryDTO> getArticleCategorys() {
		return articleCategorys;
	}

	public void setArticleCategorys(Set<CategoryDTO> articleCategorys) {
		this.articleCategorys = articleCategorys;
	}

	@Override
	public String toString() {
		return "ArticleDto [artclID=" + artclID + ", headLine=" + headLine + ", brief=" + brief + ", publishingDate="
				+ publishingDate + ", shortHeadline=" + shortHeadline + ", keywords=" + keywords + ", user=" + user
				+ ", articleCategorys=" + articleCategorys + "]";
	}
	
	
	

}
