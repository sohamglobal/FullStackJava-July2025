package com.inout.programs;
import java.util.*;

public class Discount {
	public static void main(String[] args) {
		float amount,disc;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter purchase amount : ");
		amount=sc.nextFloat();
		disc=amount*13/100;
		
		System.out.println("Amount : "+amount);
		System.out.println("Discount : "+disc);
		sc.close();
	}

}
