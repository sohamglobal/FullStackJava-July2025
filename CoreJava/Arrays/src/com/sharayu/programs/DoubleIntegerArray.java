package com.sharayu.programs;

import java.util.Scanner;

public class DoubleIntegerArray {
	public static void main(String[] args) {
		int[][] arr=new int[4][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 12 values : ");
		for(i=0;i<=3;i++)
		{
			for(j=0;j<=2;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		for(i=0;i<=3;i++)
		{
			for(j=0;j<=2;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
