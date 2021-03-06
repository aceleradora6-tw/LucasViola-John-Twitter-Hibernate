package br.com.caelum.twitter.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class AlteracaoMensagemTweet {

	public static void main(String[] args) {
		
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Tweet tweet = (Tweet) session.load(Tweet.class, 1L);
		
		Transaction tx = session.beginTransaction();
		tweet.setMensagem("alterando a mensagem!");
		session.update(tweet);
		tx.commit();
		
	}
}
