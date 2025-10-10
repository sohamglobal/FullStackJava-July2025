package com.sharayu.programs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sharayu.entities.Employee;

public class InsertEmpAutoInc {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.addAnnotatedClass(Employee.class).buildSessionFactory();
		Session ses=sf.getCurrentSession();
		ses.beginTransaction();
		
		//Employee employee=new Employee("ben stokes","admin","london",53100);
		
		Employee obj=new Employee();
		obj.setEmpnm("sadio mane");
		obj.setDept("marketing");
		obj.setLocation("dubai");
		obj.setSalary(62300);
		
		ses.persist(obj);
		ses.getTransaction().commit();
		System.out.println("New employee inserted with number "+obj.getEmpno());
		ses.close();
		
	}

}
