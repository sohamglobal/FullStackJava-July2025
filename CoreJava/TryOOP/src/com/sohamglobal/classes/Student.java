package com.sohamglobal.classes;

public class Student {
	private String result;
	private int marks;
	
	public void findResult(int marks)
	{
		this.marks=marks;
		if(marks>=35)
			result="pass";
		else
			result="fail";
	}
	
	public void showResult()
	{
		System.out.println("Marks "+marks+" and Result is "+result);
	}

}
