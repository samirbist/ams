package com.ams.db;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ams.db.dto.Article;
import com.ams.db.dto.GeneralPerson;

public class TestArticle {

	public static void main(String[] args) {

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();

			Article article = new Article();
			article.setKeywords("acdddf");

			GeneralPerson generalPerson = new GeneralPerson();
			generalPerson.setCommentTXT("ABC");

			article.setGeneralPerson(generalPerson);
			generalPerson.getArticle().add(article);
			transaction.commit();
			session.close();

			HibernateUtil.getSessionFactory().close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
