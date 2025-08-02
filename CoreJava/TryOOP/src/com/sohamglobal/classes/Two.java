package com.sohamglobal.classes;

public final class Two extends One {
	
	public void calcSum(int a,int b)
	{
		System.out.println("(Two) sum is "+(a+b));
	}
	
	//abstract function of class One - compulsory 
	public void show(String nm)
	{
		System.out.println("Welcome "+nm);
	}
}
