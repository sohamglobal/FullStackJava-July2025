package com.sharayu.programs;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sharayu.entities.Account;

public class NewAccount {
	public static void main(String[] args) {
		Account obj=new Account();
		int accno;
		String accnm,acctype;
		float balance;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter account number : ");
		accno=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account name : ");
		accnm=sc.nextLine();
		System.out.print("Enter account type : ");
		acctype=sc.nextLine();
		System.out.print("Enter balance : ");
		balance=sc.nextFloat();
		
		obj.setAccno(accno);
		obj.setAccnm(accnm);
		obj.setAcctype(acctype);
		obj.setBalance(balance);
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Account.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		ses.persist(obj);
		ses.getTransaction().commit();
		System.out.println("New account inserted in the DB");
		ses.close();
		
	}

}
