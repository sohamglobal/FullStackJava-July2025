package com.sharayu.programs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sharayu.entities.Account;

import jakarta.persistence.Query;

public class UpdateForDeposit {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		int accno=1012;
		float amount=5000;
		
		Query q=ses.createQuery("update Account set balance=balance+:amt where accno=:no");
		q.setParameter("amt", amount);
		q.setParameter("no",accno);
		int cnt=q.executeUpdate();
		if(cnt>0)
			System.out.println("Deposit done");
		else
			System.out.println("Failed...");
		ses.close();
		
	}

}
