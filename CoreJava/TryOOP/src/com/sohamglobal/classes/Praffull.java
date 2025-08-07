package com.sohamglobal.classes;

public class Praffull extends Employee {
	
	public void show(double basic)
	{
		System.out.println("Welcome to "+super.officeName);
		super.calcNetSalary(basic);
		System.out.println("you are in Praffull class");
	}

}
