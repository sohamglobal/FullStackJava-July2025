package com.sohamglobal.classes;

public class Person {
	
	private String personName;
	private String personCity;
	
	//Constructor function
	public Person()
	{
		System.out.println("Welcome to Person class");
		personName="praffull";
		personCity="london";
	}

	public void newPerson(String personName,String personCity)
	{
		this.personName=personName;
		this.personCity=personCity;
	}
	
	public void display()
	{
		System.out.println("Name : "+personName);
		System.out.println("City : "+personCity);		
	}

}
