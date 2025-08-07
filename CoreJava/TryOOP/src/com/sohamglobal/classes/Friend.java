package com.sohamglobal.classes;

public class Friend {
	
	private static String friendName;
	
	public static void acceptName(String nm)
	{
		friendName=nm;
	}
	
	public void showName()
	{
		System.out.println("Name is "+friendName);
	}

}
