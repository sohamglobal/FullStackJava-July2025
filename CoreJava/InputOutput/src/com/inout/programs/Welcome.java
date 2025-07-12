package com.inout.programs;
import java.util.*;

public class Welcome {
	public static void main(String[] args) {
		String nm;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name : ");
		nm=sc.nextLine();
		System.out.println("Welcome "+nm+" to Java in Eclipse");
		sc.close();
	}

}
