package com.sohamglobal.programs;
import java.util.*;

public class StudentResult {
	public static void main(String[] args) {
		String studName;
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name : ");
		studName=sc.nextLine();
		System.out.print("Enter marks (out of 100) : ");
		marks=sc.nextInt();
		
		if(marks>=35)
			System.out.println("you are pass");
		else
			System.out.println("you are fail");
		
		sc.close();
	}

}
