package tr.com.derin.java.dao.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.TransactionException;
import org.hibernate.cfg.Configuration;

import tr.com.derin.java.domain.Aphorism;
import tr.com.derin.java.domain.User;

/**
 * Hibernate i test etmek için yazýlmýþtýr.
 * @author user
 *
 */
public class HibernateTestApp
{
	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		User user = new User();
		user.setUsername("name1");
		
		Set<Aphorism> aphorismSet = new HashSet<Aphorism>();
		aphorismSet.add(new Aphorism("content1",user));
		aphorismSet.add(new Aphorism("content2",user));
		
		//aphorismSet.add(new Aphorism("content1"));
		//aphorismSet.add(new Aphorism("content2"));
		
		
		user.setAphorismSet(aphorismSet);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
		
		
	}
}
