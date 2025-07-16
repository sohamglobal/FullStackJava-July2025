package com.sohamglobal.programs;
import java.util.*;

public class CountryCapital {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String countryName;
		System.out.print("Enter country name : ");
		countryName=sc.nextLine();
		
		switch(countryName)
		{
		case "japan":
			System.out.println("capital is tokyo");
			break;
		case "england":
			System.out.println("capital is london");
			break;
		case "germany":
			System.out.println("capital is berlin");
			break;
		default:
			System.out.println("information not available");
		
		}
		
	}

}
