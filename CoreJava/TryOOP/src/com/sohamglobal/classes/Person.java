package com.sohamglobal.classes;

public class Person {
	
	private String personName;
	private String personCity;
	
	//Empty (NoArg) Constructor function
	public Person()
	{
		System.out.println("Welcome to Person class");
		personName="praffull";
		personCity="london";
	}

	//parameterized constructor (all arg)
	public Person(String personName, String personCity) {
		this.personName = personName;
		this.personCity = personCity;
	}
		
	
	public void display()
	{
		System.out.println("Name : "+personName);
		System.out.println("City : "+personCity);
	}

	

	

	
}
