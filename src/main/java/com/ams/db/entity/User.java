package com.ams.db.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "GENN_PERSN")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long gennPID;

	@Column(name = "LOGIN_NM", nullable = false, unique=true)
	private String loginName;

	@Column(name = "PASSWORD", nullable = false)
	private String password;

	@Column(name = "PIN")
	private String pin;
	@Column(name = "GIVEN_NM")
	private String givenName;
	@Column(name = "FMLY_NM")
	private String familyName;
	@Column(name = "MID_INIT_NM")
	private String middleName;
	@Column(name = "JNJ_EMAIL_ADDR_TXT")
	private String email;
	@Column(name = "CO_NM")
	private String companyName;
	@Column(name = "APRVD_IND", nullable = false)
	private char approvedIND;
	@Column(name = "CMNT_TXT")
	private String commentTXT;
	
	@OneToMany(mappedBy = "generalPerson")
	private Collection<Article> article = new ArrayList<Article>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;

	public User() {
		
	}

	public User(String loginName, String password, String pin, String givenName, String familyName, String middleName,
			String email, String companyName, String commentTXT, Set<Role> roles) {
		this.loginName = loginName;
		this.password = password;
		this.pin = pin;
		this.givenName = givenName;
		this.familyName = familyName;
		this.middleName = middleName;
		this.email = email;
		this.companyName = companyName;
		this.commentTXT = commentTXT;
		this.roles = roles;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public long getGennPID() {
		return gennPID;
	}

	public void setGennPID(long gennPID) {
		this.gennPID = gennPID;
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

	public char getApprovedIND() {
		return approvedIND;
	}

	public void setApprovedIND(char approvedIND) {
		this.approvedIND = approvedIND;
	}

	public String getCommentTXT() {
		return commentTXT;
	}

	public void setCommentTXT(String commentTXT) {
		this.commentTXT = commentTXT;
	}

	
	public Collection<Article> getArticle() {
		return article;
	}

	public void setArticle(Collection<Article> article) {
		this.article = article;
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

}
