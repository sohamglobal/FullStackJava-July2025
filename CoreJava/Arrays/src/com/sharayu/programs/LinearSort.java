package com.sharayu.programs;

public class LinearSort {
	public static void main(String[] args) {
		int[] arr= {21,9,13,17,44,23,89,15,72,33};
		int i,j,temp;
		
		for(i=0;i<=8;i++)
		{
			for(j=i+1;j<=9;j++)
			{
				if(arr[j]<arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(i=0;i<=9;i++)
			System.out.print(arr[i]+"  ");
	}

}
