package com.ams.dto;

import java.util.ArrayList;
import java.util.Collection;

public class UserDTO {
	
	
	private long id;
	private String pin;
	private String givenName;
	private String familyName;
	private String middleName;
	private String email;
	private String companyName;
	private String commentTXT;
	private Collection<ArticleDTO> article = new ArrayList<ArticleDTO>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCommentTXT() {
		return commentTXT;
	}
	public void setCommentTXT(String commentTXT) {
		this.commentTXT = commentTXT;
	}
	public Collection<ArticleDTO> getArticle() {
		return article;
	}
	public void setArticle(Collection<ArticleDTO> article) {
		this.article = article;
	}
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", pin=" + pin + ", givenName=" + givenName + ", familyName=" + familyName
				+ ", middleName=" + middleName + ", email=" + email + ", companyName=" + companyName + ", commentTXT="
				+ commentTXT + ", article=" + article + "]";
	}

	

}
