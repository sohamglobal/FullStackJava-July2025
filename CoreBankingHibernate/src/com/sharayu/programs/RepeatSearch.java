package com.sharayu.programs;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sharayu.entities.Account;

import jakarta.persistence.Query;

public class RepeatSearch {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Account.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		Query q=ses.createQuery("from Account",Account.class);
		List<Account> list=q.getResultList();
		
		int accno=0;
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.print("Enter account number : ");
			accno=sc.nextInt();
			int no=accno;
			
			list.stream().filter(a->a.getAccno()==no).forEach(a->System.out.println(a.getAccnm()+" | "+a.getBalance()));
		}
		while(accno>0);
		
	}

}
