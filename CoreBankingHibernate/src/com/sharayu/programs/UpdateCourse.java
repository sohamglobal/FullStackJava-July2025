package com.sharayu.programs;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class UpdateCourse {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				.configure()
				.buildSessionFactory();
		Session ses=sf.openSession();
		ses.beginTransaction();
		
		int regno;
		String newcourse;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter registration number : ");
		regno=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter new course : ");
		newcourse=sc.nextLine();
		
		Query q=ses.createQuery("update Student set course=:co where regno=:no");
		q.setParameter("co", newcourse);
		q.setParameter("no", regno);
		int cnt=q.executeUpdate();
		if(cnt==1)
			System.out.println("Course Modified");
		else
			System.out.println("Not found");
		
		ses.close();
	}

}
