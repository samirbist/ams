package com.ams.dto;

import java.util.Set;

public class UserDTO {

	private long id;
	private String pin;
	private String givenName;
	private String familyName;
	private String middleName;
	private String email;
	private String companyName;
	private String commentTXT;
	private String loginName;
	private String password;
	private Character approvedIND;
	private Set<String> roles;

	public UserDTO(long id, String pin, String givenName, String familyName, String middleName, String email,
			String companyName, String commentTXT, String loginName, String password, Character approvedIND,
			Set<String> roles) {
		this.id = id;
		this.pin = pin;
		this.givenName = givenName;
		this.familyName = familyName;
		this.middleName = middleName;
		this.email = email;
		this.companyName = companyName;
		this.commentTXT = commentTXT;
		this.loginName = loginName;
		this.password = password;
		this.approvedIND = approvedIND;
		this.roles = roles;
	}

	public Character getApprovedIND() {
		return approvedIND;
	}

	public void setApprovedIND(Character approvedIND) {
		this.approvedIND = approvedIND;
	}

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", pin=" + pin + ", givenName=" + givenName + ", familyName=" + familyName
				+ ", middleName=" + middleName + ", email=" + email + ", companyName=" + companyName + ", commentTXT="
				+ commentTXT + "]";
	}

}
