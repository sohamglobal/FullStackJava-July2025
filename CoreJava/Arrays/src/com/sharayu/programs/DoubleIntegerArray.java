package com.sharayu.programs;

public class DoubleIntegerArray {
	public static void main(String[] args) {
		int[][] arr=new int[3][2];
		arr[0][0]=48;
		arr[0][1]=57;
		arr[1][0]=31;
		arr[1][1]=77;
		arr[2][0]=64;
		arr[2][1]=95;
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
