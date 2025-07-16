package com.sharayu.programs;

public class StringFunctions {
	public static void main(String[] args) {
		String str="you will never walk alone";
		System.out.println(str);
		System.out.println(str.length());  //no of chars in string
		System.out.println(str.charAt(13));
		System.out.println(str.substring(9));
		System.out.println(str.substring(9,16));  // chars 9 to 15
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String password="Liverpool";
		System.out.println(password.equals("chelsea"));
		System.out.println(password.equals("liverpool"));
		System.out.println(password.equalsIgnoreCase("liverpool"));
		
		System.out.println(password.compareTo("Liverpool"));
		
		System.out.println(str.contains("walk")); //true
		System.out.println(str.startsWith("We")); //false
		System.out.println(str.endsWith("one"));
		
	}

}
