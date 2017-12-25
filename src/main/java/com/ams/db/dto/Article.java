package com.ams.db.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "ARTCL")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ARTCL_ID")
	private int artclID;
	@Column(name = "HDLN_TXT")
	private String headLine;
	@Column(name = "BRF_TXT")
	private String brief;
	@Column(name = "PUBLS_DT")
	private Date publishingDate;
	@Column(name = "ARCHV_DT")
	private Date archivingDate;
	@Column(name = "PUBLS_IND")
	private char publishingInd;
	@Column(name = "DEL_DT")
	private Date deleteDate;
	@Column(name = "DEL_APRVD_IND")
	private char delAprvdInd;
	@Column(name = "PODCAST_IND")
	private char podcastInd;
	@Column(name = "BLOGS_IND")
	private char blogsInd;
	@Column(name = "MEDIA_PLAYER_IND")
	private char mediaPlayerInd;
	@Column(name = "CMNT_TXT")
	private String comment;
	@Column(name = "NUM_HITS")
	private int numOfHits;
	@Column(name = "SHRT_HDLN_TXT")
	private String shortHeadline;
	@Column(name = "KYWRDS_TXT")
	private String keywords;
	@Column(name = "DSCUSN_IND")
	private char discussionInd;
	@Column(name = "DSCUSN_URL_TXT")
	private String descussionUrlTxt;
	@Column(name = "Row_Add_Tms")
	private Date rowAddTime;
	@Column(name = "Row_Add_Uid_No")
	private String rowAddUidNo;
	@Column(name = "Row_Add_Pgm_No")
	private String rowAddProgNo;
	@Column(name = "Row_Updt_Tms")
	private Date rowUpdateTime;
	@Column(name = "Row_Updt_Uid_No")
	private String rowUpdateUserIdNo;
	@Column(name = "Row_Updt_Pgm_No")
	private String rowUpdateProgrammNo;
	@Lob
	@Column(name = "STORY_DOC")
	private String storyDoc;
	@Column(name = "PODCAST_URL_TXT")
	private String podcastUrlTxt;
	@Column(name = "BLOG_URL_TXT")
	private String blogURLText;
	@Column(name = "MEDIA_PLAYER_URL_TXT")
	private String mediaPlayterURLText;

	public int getArtclID() {
		return artclID;
	}

	public void setArtclID(int artclID) {
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

	public char getPodcastInd() {
		return podcastInd;
	}

	public void setPodcastInd(char podcastInd) {
		this.podcastInd = podcastInd;
	}

	public char getBlogsInd() {
		return blogsInd;
	}

	public void setBlogsInd(char blogsInd) {
		this.blogsInd = blogsInd;
	}

	public char getMediaPlayerInd() {
		return mediaPlayerInd;
	}

	public void setMediaPlayerInd(char mediaPlayerInd) {
		this.mediaPlayerInd = mediaPlayerInd;
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

	public char getDiscussionInd() {
		return discussionInd;
	}

	public void setDiscussionInd(char discussionInd) {
		this.discussionInd = discussionInd;
	}

	public String getDescussionUrlTxt() {
		return descussionUrlTxt;
	}

	public void setDescussionUrlTxt(String descussionUrlTxt) {
		this.descussionUrlTxt = descussionUrlTxt;
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

	public String getStoryDoc() {
		return storyDoc;
	}

	public void setStoryDoc(String storyDoc) {
		this.storyDoc = storyDoc;
	}

	public String getPodcastUrlTxt() {
		return podcastUrlTxt;
	}

	public void setPodcastUrlTxt(String podcastUrlTxt) {
		this.podcastUrlTxt = podcastUrlTxt;
	}

	public String getBlogURLText() {
		return blogURLText;
	}

	public void setBlogURLText(String blogURLText) {
		this.blogURLText = blogURLText;
	}

	public String getMediaPlayterURLText() {
		return mediaPlayterURLText;
	}

	public void setMediaPlayterURLText(String mediaPlayterURLText) {
		this.mediaPlayterURLText = mediaPlayterURLText;
	}

}
