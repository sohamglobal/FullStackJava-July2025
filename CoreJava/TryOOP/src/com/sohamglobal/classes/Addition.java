package com.sohamglobal.classes;

public class Addition {
	private int result;
	
	public Addition()
	{
		result=0;
	}
	
	public void calcSum()
	{
		System.out.println("Result is "+result);
	}
	
	public void calcSum(int a)
	{
		result=a;
		System.out.println("Result is "+result);
	}
	
	public void calcSum(int a,int b)
	{
		result=a+b;
		System.out.println("Result is "+result);
	}

}
