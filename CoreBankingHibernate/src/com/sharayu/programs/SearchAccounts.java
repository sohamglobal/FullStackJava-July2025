package com.sharayu.programs;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sharayu.entities.Account;

import jakarta.persistence.Query;

public class SearchAccounts {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Account.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		String typ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account type to search : ");
		typ=sc.nextLine();
				
		//Query q=ses.createQuery("from Account where acctype=:type",Account.class);
		//q.setParameter("type", typ);
		Query q=ses.createQuery("from Account",Account.class);
		
		List<Account> list=q.getResultList();
		
		//list.stream().forEach(a->System.out.println(a.getAccnm()));
		list.stream().filter(a->a.getAcctype().equals(typ)).forEach(a->System.out.println(a.getAccnm()));
		ses.close();
	}
	

}
