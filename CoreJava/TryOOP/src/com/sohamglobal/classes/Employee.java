package com.sohamglobal.classes;

public class Employee {
	
	protected String officeName="spider projects one";
	
		
	public void calcNetSalary(double basic)
	{
		double allowance,incentives,total,tax,net;
		allowance=basic*45/100;
		incentives=basic*30/100;
		total=basic+allowance+incentives;
		if((total*12)>500000)
			tax=total*4/100;
		else
			tax=0;
		
		net=total-tax;
		System.out.println("Net salary is "+net);
	}

}
