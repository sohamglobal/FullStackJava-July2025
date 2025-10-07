package com.sharayu.programs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sharayu.entities.Student;

public class InsertStudent {
	public static void main(String[] args) {
		Student student=new Student();
		student.setRegno(129);
		student.setStudnm("sharayu");
		student.setCourse("spark");
		
		Configuration cfg=new Configuration().configure();
		//SessionFactory sf=cfg.addAnnotatedClass(Student.class).buildSessionFactory();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		ses.persist(student);
		ses.getTransaction().commit();
		System.out.println("New student added to DB");
		ses.close();
	}

}
