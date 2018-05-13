package com.ams.db.entity;

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

}
