package com.sharayu.programs;

import java.util.Scanner;

public class SingleIntegerArray {
	public static void main(String[] args) {
		int i,sum=0;
		int[] n=new int[15];   //array is a collection of variables of same type
		Scanner sc=new Scanner(System.in);
		
		//accept value for each array element
		for(i=0;i<=14;i++)
		{
			System.out.print("Enter a number : ");
			n[i]=sc.nextInt();
		}
		
		//add all values in a variable to get the sum
		for(i=0;i<=14;i++)
		{
			sum+=n[i];
		}
		
		
		System.out.println("sum is "+sum);
		sc.close();		
	}

}
