package com.sharayu.utilities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	
	private Session session;

	public Session getSession() {
		SessionFactory sf=new Configuration()
				.configure()
				.buildSessionFactory();
		session=sf.openSession();
		
		return session;
	}
	
	

}
