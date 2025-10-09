package com.sharayu.programs;

import java.util.Scanner;

import org.hibernate.Session;

import com.sharayu.utilities.HibernateUtility;

import jakarta.persistence.Query;

public class DeleteAccount {
	public static void main(String[] args) {
		int accno;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter account number to delete : ");
		accno=sc.nextInt();
		
		HibernateUtility utility=new HibernateUtility();
		Session ses=utility.getSession();
		
		ses.beginTransaction();
		
		Query q=ses.createQuery("delete Account where accno=:no");
		q.setParameter("no", accno);
		int cnt=q.executeUpdate();
		if(cnt==1)
			System.out.println("Account deleted");
		else
			System.out.println("account not found");
		ses.close();
	}

}
