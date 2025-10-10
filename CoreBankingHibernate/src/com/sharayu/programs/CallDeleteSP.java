package com.sharayu.programs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sharayu.entities.Account;

import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

public class CallDeleteSP {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				.configure()
				.addAnnotatedClass(Account.class)
				.buildSessionFactory();
		Session ses=sf.openSession();
		ses.beginTransaction();
		
		StoredProcedureQuery q=ses.createStoredProcedureQuery("delacc");
		q.registerStoredProcedureParameter("ano", Integer.class, ParameterMode.IN);
		q.setParameter("ano",1027 );
		q.execute();
		System.out.println("deleted...");
		ses.close();
		
	}

}
