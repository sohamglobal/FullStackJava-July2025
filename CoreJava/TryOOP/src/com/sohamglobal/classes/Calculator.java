package com.sohamglobal.classes;

public class Calculator {
	
	private static int sum;
	
	public static void add(int a,int b)
	{
		sum=a+b;
		System.out.println("sum is "+sum);
	}
	
	public void show(String nm)
	{
		System.out.println("thanks "+nm);
	}

}
