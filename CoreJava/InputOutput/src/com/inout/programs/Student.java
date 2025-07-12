package com.inout.programs;
import java.util.*;

public class Student {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nm;
		int mks;
		
		System.out.print("Enter student name : ");
		nm=sc.nextLine();
		System.out.print("Enter marks : ");
		mks=sc.nextInt();
		
		System.out.println("Name : "+nm);
		System.out.println("Marks : "+mks);
		sc.close();
	}

}
