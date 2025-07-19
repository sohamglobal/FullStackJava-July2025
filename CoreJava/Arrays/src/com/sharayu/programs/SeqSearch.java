package com.sharayu.programs;

public class SeqSearch {
	public static void main(String[] args) {
		int[] arr= {21,9,13,17,44,23,89,15,72,33};
		int i,cnt=0;
		
		for(i=0;i<=9;i++)
		{
			if(arr[i]%2==0)
				cnt++;
				
		}
		
		System.out.println("total even numbers "+cnt);
		
		
		
	}

}
