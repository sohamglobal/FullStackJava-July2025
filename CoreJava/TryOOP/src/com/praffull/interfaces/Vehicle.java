package com.praffull.interfaces;

public interface Vehicle {
	public void start();
	public void stop();
	
	default void showMessage()
	{
		System.out.println("Use public trasport if possible");
	}
	
	static void getRules()
	{
		System.out.println("Dont drink and drive");
		System.out.println("Drive with documents");
	}
}
