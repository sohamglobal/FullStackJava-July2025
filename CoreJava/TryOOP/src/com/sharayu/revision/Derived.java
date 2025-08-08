package com.sharayu.revision;

public class Derived extends Base {
	
	public Derived()
	{
		super();
		System.out.println("Empty constructor of Derived");
	}
	
	public Derived(String name,String city)
	{
		super(name);
		System.out.println("Parameterized constructor of Derived "+city);
	}

}
