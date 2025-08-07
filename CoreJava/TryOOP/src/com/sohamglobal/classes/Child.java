package com.sohamglobal.classes;

public class Child extends Parent{
	
	public Child()
	{
		super();
		System.out.println("empty of derived");
	}
	
	public Child(String city)
	{
		//super();
		super("sharayu");
		System.out.println("parameterized of derived "+city);
	}

}
