package com.sohamglobal.programs;
import java.util.*;

public class SquareRepeat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		
		do
		{
			System.out.print("Enter a number : ");
			n=sc.nextInt();
			System.out.println("Square is "+n*n);
		}
		while(n>0);
	}

}
