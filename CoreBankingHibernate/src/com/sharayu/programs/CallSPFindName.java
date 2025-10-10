package com.sharayu.programs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;


public class CallSPFindName {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				.configure()
				.buildSessionFactory();
		Session ses=sf.openSession();
		ses.beginTransaction();
		
		StoredProcedureQuery q=ses.createStoredProcedureQuery("findname");
		q.registerStoredProcedureParameter("ano", Integer.class, ParameterMode.IN);
		q.registerStoredProcedureParameter("anm", String.class, ParameterMode.OUT);
		q.setParameter("ano", 1033);
		q.execute();
		String nm=(String) q.getOutputParameterValue("anm");
		System.out.println("Name : "+nm);
		ses.close();
		
		
	}

}
