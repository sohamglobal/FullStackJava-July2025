package com.sharayu.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	private int regno;
	private String studnm;
	private String course;
	
	public Student() {}

	public Student(int regno, String studnm, String course) {
		super();
		this.regno = regno;
		this.studnm = studnm;
		this.course = course;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getStudnm() {
		return studnm;
	}

	public void setStudnm(String studnm) {
		this.studnm = studnm;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
