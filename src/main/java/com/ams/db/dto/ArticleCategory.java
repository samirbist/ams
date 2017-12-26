package com.ams.db.dto;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ARTCL_CATG")
public class ArticleCategory {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
	private int id;
	

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ARTCL_ID")  
	private Article article;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CATG_ID")  
	private Category category;
    
    @Column(name = "Row_Add_Tms")
    private Date rowAddTms;
    
    @Column(name = "Row_Add_Uid_No")
    private String rowAddUidNo;
    
    @Column(name = "Row_Add_Pgm_No")
	private String rowAddPgmNo;
    
    @Column(name = "Row_Updt_Tms")
	private Date rowUpdtTms;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
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
	@Column(name = "Row_Updt_Uid_No")
	private String rowUpdtUidNo;
    @Column(name = "Row_Updt_Pgm_No")
	private String rowUpdtPgmNo;
    
    

}
