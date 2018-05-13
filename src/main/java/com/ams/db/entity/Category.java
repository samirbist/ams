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
