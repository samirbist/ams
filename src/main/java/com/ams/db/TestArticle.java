package com.ams.db;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ams.db.dto.Article;

public class TestArticle {

	public static void main(String[] args) {

		
	Session session =	HibernateUtil.getSessionFactory().openSession();
	Transaction transaction= session.beginTransaction();
	
	Article article = new Article();
	article.setKeywords("acdddf");
	transaction.commit();
	session.close();
	
	HibernateUtil.getSessionFactory().close();
	
	}

}
