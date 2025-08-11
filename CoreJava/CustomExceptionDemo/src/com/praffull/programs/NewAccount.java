package com.praffull.programs;
import java.util.*;

import com.sharayu.classes.InvalidAgeException;

public class NewAccount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		
		System.out.println("Enter age : ");
		age=sc.nextInt();

		try {
			if(age<18)
				throw new InvalidAgeException("Age must be 18 or above");
			else
				System.out.println("Eligible to open account");
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		sc.close();		
	}

}
