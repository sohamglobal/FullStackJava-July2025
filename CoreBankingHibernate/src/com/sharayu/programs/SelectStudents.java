package com.sharayu.programs;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sharayu.entities.Student;

import jakarta.persistence.Query;

public class SelectStudents {
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		// select * from students
		Query q=ses.createQuery("from Student where course like '%java%'",Student.class);
		List<Student> list=q.getResultList();
		
		System.out.println(list.size());
		list.stream().forEach(obj->System.out.println(obj.getStudnm()));
		
		ses.close();
	}

}
