package com.inout.programs;
import java.util.*;

public class Taxation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double income,tax;
		System.out.print("Enter annual income : ");
		income=sc.nextDouble();
		tax=income*7/100;
		System.out.println("Income tax is "+tax);
		sc.close();
	}

}
