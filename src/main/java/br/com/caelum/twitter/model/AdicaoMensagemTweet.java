package br.com.caelum.twitter.model;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class AdicaoMensagemTweet {

	public static void main(String[] args) {

		// Configuração do hibernate
		AnnotationConfiguration configuration  = new AnnotationConfiguration();
		configuration.configure();
		
		// Cria sessão
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Tweet tweet = new Tweet();
		tweet.setMensagem("jyrjytrjyrjt");
		
		Transaction tx = session.beginTransaction();
		session.save(tweet);
		tx.commit();
				
		
	}

}
