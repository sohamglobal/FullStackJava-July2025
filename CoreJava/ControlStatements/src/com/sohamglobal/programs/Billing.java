package com.sohamglobal.programs;

import java.util.Scanner;

public class Billing {
	public static void main(String[] args) {
		double amount,disc;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter purchase amount : ");
		amount=sc.nextDouble();
		
		if(amount>20000)
		{
			System.out.println("discount is 13%");
			disc=amount*13/100;
		}
		else
		{
			if(amount>10000)
			{
				System.out.println("discount is 9%");
				disc=amount*9/100;
			}
			else
			{
				System.out.println("no discount");
				disc=0;
			}
		}
		
		
		System.out.println("Discount is "+disc);
		
		sc.close();
	}

}
