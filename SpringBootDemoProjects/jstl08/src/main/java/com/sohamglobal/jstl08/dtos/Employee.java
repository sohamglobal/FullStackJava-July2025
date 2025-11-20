package com.sohamglobal.jstl08.dtos;

public class Employee {
	private int employeeNumber;
	private String employeeName;
	private String department;
	private String post;
	private String location;
	private double salary;
	
	public Employee(int employeeNumber, String employeeName, String department, String post, String location,
			double salary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.department = department;
		this.post = post;
		this.location = location;
		this.salary = salary;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	

}
