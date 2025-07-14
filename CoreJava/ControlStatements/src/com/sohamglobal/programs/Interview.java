package com.sohamglobal.programs;

import java.util.Scanner;

public class Interview {
	public static void main(String[] args) {
		int age,experience;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter age : ");
		age=sc.nextInt();
		System.out.print("Enter experience (years) : ");
		experience=sc.nextInt();

		if(age<35 && experience>2)
			System.out.println("Selected for interview");
		else
			System.out.println("Not selected");
		
		// if(age!=20)
		sc.close();
	}

}
