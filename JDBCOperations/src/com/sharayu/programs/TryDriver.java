package com.sharayu.programs;

public class TryDriver {
	public static void main(String[] args) {
		System.out.println("First JDBC program to test Driver running...");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL JDBC Driver loaded successfully");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver not found");
		}
	}

}
