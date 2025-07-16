package com.sohamglobal.programs;

public class Message {
	public static void main(String[] args) {
		
		int i;
		
		for(i=1;i<=10;i++)
		{
		System.out.println("welcome to java "+i);
		}
		
		System.out.println("-------------");
		
		for(i=50;i>=41;i--)
			System.out.println(i);
		
		System.out.println("-------------");
		
		for(i=1;i<=25;i+=3)
			System.out.println(i);
		
		System.out.println("-------------");
		
		for(char ch='A';ch<='Z';ch++)
			System.out.print(ch+" ");
		
	}

}
