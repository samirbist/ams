package com.ams.db.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ARTCL")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ARTCL_ID")
	private long artclID;
	@Column(name = "HDLN_TXT", nullable = false)
	private String headLine;
	@Column(name = "BRF_TXT", nullable = true)
	private String brief;
	@Column(name = "PUBLS_DT", nullable = true)
	private Date publishingDate;
	@Column(name = "ARCHV_DT", nullable = true)
	private Date archivingDate;
	@Column(name = "PUBLS_IND", nullable = false)
	private char publishingInd;
	@Column(name = "DEL_DT", nullable = true)
	private Date deleteDate;
	@Column(name = "DEL_APRVD_IND", nullable = true)
	private char delAprvdInd;
	@Column(name = "CMNT_TXT", nullable = true)
	private String comment;
	@Column(name = "NUM_HITS", nullable = false)
	private int numOfHits;
	@Column(name = "SHRT_HDLN_TXT", nullable = false)
	private String shortHeadline;
	@Column(name = "KYWRDS_TXT", nullable = true)
	private String keywords;
	@Column(name = "Row_Add_Tms", nullable = false)
	private Date rowAddTime;
	@Column(name = "Row_Add_Uid_No", nullable = false)
	private String rowAddUidNo;
	@Column(name = "Row_Add_Pgm_No", nullable = false)
	private String rowAddProgNo;
	@Column(name = "Row_Updt_Tms", nullable = false)
	private Date rowUpdateTime;
	@Column(name = "Row_Updt_Uid_No", nullable = false)
	private String rowUpdateUserIdNo;
	@Column(name = "Row_Updt_Pgm_No", nullable = false)
	private String rowUpdateProgrammNo;

	@ManyToOne
	@JoinColumn(name = "AUTH_GENN_PID")
	private User generalPerson;

	@OneToMany(mappedBy = "article")
	private Set<ArticleCategory> articleCategorys = new HashSet<ArticleCategory>();

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

	public Date getArchivingDate() {
		return archivingDate;
	}

	public void setArchivingDate(Date archivingDate) {
		this.archivingDate = archivingDate;
	}

	public char getPublishingInd() {
		return publishingInd;
	}

	public void setPublishingInd(char publishingInd) {
		this.publishingInd = publishingInd;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public char getDelAprvdInd() {
		return delAprvdInd;
	}

	public void setDelAprvdInd(char delAprvdInd) {
		this.delAprvdInd = delAprvdInd;
	}

	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getNumOfHits() {
		return numOfHits;
	}

	public void setNumOfHits(int numOfHits) {
		this.numOfHits = numOfHits;
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


	public Date getRowAddTime() {
		return rowAddTime;
	}

	public void setRowAddTime(Date rowAddTime) {
		this.rowAddTime = rowAddTime;
	}

	public String getRowAddUidNo() {
		return rowAddUidNo;
	}

	public void setRowAddUidNo(String rowAddUidNo) {
		this.rowAddUidNo = rowAddUidNo;
	}

	public String getRowAddProgNo() {
		return rowAddProgNo;
	}

	public void setRowAddProgNo(String rowAddProgNo) {
		this.rowAddProgNo = rowAddProgNo;
	}

	public Date getRowUpdateTime() {
		return rowUpdateTime;
	}

	public void setRowUpdateTime(Date rowUpdateTime) {
		this.rowUpdateTime = rowUpdateTime;
	}

	public String getRowUpdateUserIdNo() {
		return rowUpdateUserIdNo;
	}

	public void setRowUpdateUserIdNo(String rowUpdateUserIdNo) {
		this.rowUpdateUserIdNo = rowUpdateUserIdNo;
	}

	public String getRowUpdateProgrammNo() {
		return rowUpdateProgrammNo;
	}

	public void setRowUpdateProgrammNo(String rowUpdateProgrammNo) {
		this.rowUpdateProgrammNo = rowUpdateProgrammNo;
	}

	
	public User getGeneralPerson() {
		return generalPerson;
	}

	public void setGeneralPerson(User generalPerson) {
		this.generalPerson = generalPerson;
	}

	public Set<ArticleCategory> getArticleCategorys() {
		return articleCategorys;
	}

	public void setArticleCategorys(Set<ArticleCategory> articleCategorys) {
		this.articleCategorys = articleCategorys;
	}

}
