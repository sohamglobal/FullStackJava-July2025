package com.sohamglobal.programs;

import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int month;
		
		System.out.print("Enter month number : ");
		month=sc.nextInt();
		
		switch(month)
		{
		case 10:
		case 11:
		case 12:
		case 1:
		case 2:
			System.out.println("Winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Summer");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Monsoon");
			break;
		default:
			System.out.println("invalid month number");
		}
		sc.close();
	}

}
