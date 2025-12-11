package com.sohamglobal.jpaconstraints10.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empno;
	
	@Column(name="empnm", nullable=false, length=100)
	private String empnm;
	
	@Column(name="dept",nullable=false, length=50)
	private String dept;
	
	@Column(name="post",nullable=false, length=50)
	private String post;
	
	@Column(nullable=false,length=100)
	private String location="mumbai";
	
	@Column(unique=true,length=15)
	//@Pattern(regexp = "\\d{10,15}", message = "Mobile number must contain 10–15 digits")
	private String mobile;
	
	
	@Column(nullable=false)
	private float salary;


	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getEmpnm() {
		return empnm;
	}


	public void setEmpnm(String empnm) {
		this.empnm = empnm;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getPost() {
		return post;
	}


	public void setPost(String post) {
		this.post = post;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}
	

	
	


}
