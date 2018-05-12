package com.ams.db.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CATG")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CATG_ID")
	private long CATG_ID;
	@Column(name = "CATG_NM")
	private String categoryNumber;
	@Column(name = "PUBLS_DT")
	private Date publishingDate;
	@Column(name = "ARCHV_DT")
	private Date archivingDate;
	@Column(name = "PUBLS_IND")
	private char publishingIND;
	@Column(name = "PARNT_CATG_ID")
	private String parentCategoryID;
	@Column(name = "DESCN_TXT")
	private String descriptionTXT;
	
	@Column(name = "Row_Add_Tms")
	private Date rowAddTms;
	@Column(name = "Row_Add_Uid_No")
	private String rowAddUidNo;
	@Column(name = "Row_Add_Pgm_No")
	private String rowAddPgmNo;
	@Column(name = "Row_Updt_Tms")
	private Date rowUpdtTms;
	@Column(name = "Row_Updt_Uid_No")
	private String rowUpdtUidNo;
	@Column(name = "Row_Updt_Pgm_No")
	private String rowUpdtPgmNo;
	
	@Column(name = "CAGT_SHRT_NM")
	private String cagtShrtNM;

	@OneToMany(mappedBy = "category")
	private Set<ArticleCategory> articleCategorys = new HashSet<ArticleCategory>();

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

	public Date getArchivingDate() {
		return archivingDate;
	}

	public void setArchivingDate(Date archivingDate) {
		this.archivingDate = archivingDate;
	}

	public char getPublishingIND() {
		return publishingIND;
	}

	public void setPublishingIND(char publishingIND) {
		this.publishingIND = publishingIND;
	}

	
	public String getParentCategoryID() {
		return parentCategoryID;
	}

	public void setParentCategoryID(String parentCategoryID) {
		this.parentCategoryID = parentCategoryID;
	}

	public String getDescriptionTXT() {
		return descriptionTXT;
	}

	public void setDescriptionTXT(String descriptionTXT) {
		this.descriptionTXT = descriptionTXT;
	}


	public Date getRowAddTms() {
		return rowAddTms;
	}

	public void setRowAddTms(Date rowAddTms) {
		this.rowAddTms = rowAddTms;
	}

	public String getRowAddUidNo() {
		return rowAddUidNo;
	}

	public void setRowAddUidNo(String rowAddUidNo) {
		this.rowAddUidNo = rowAddUidNo;
	}

	public String getRowAddPgmNo() {
		return rowAddPgmNo;
	}

	public void setRowAddPgmNo(String rowAddPgmNo) {
		this.rowAddPgmNo = rowAddPgmNo;
	}

	public Date getRowUpdtTms() {
		return rowUpdtTms;
	}

	public void setRowUpdtTms(Date rowUpdtTms) {
		this.rowUpdtTms = rowUpdtTms;
	}

	public String getRowUpdtUidNo() {
		return rowUpdtUidNo;
	}

	public void setRowUpdtUidNo(String rowUpdtUidNo) {
		this.rowUpdtUidNo = rowUpdtUidNo;
	}

	public String getRowUpdtPgmNo() {
		return rowUpdtPgmNo;
	}

	public void setRowUpdtPgmNo(String rowUpdtPgmNo) {
		this.rowUpdtPgmNo = rowUpdtPgmNo;
	}

	

	public String getCagtShrtNM() {
		return cagtShrtNM;
	}

	public void setCagtShrtNM(String cagtShrtNM) {
		this.cagtShrtNM = cagtShrtNM;
	}

	public Set<ArticleCategory> getArticleCategorys() {
		return articleCategorys;
	}

	public void setArticleCategorys(Set<ArticleCategory> articleCategorys) {
		this.articleCategorys = articleCategorys;
	}
	
	
}
