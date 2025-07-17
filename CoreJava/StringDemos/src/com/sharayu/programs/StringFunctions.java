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
		System.out.println("Praffull".equalsIgnoreCase("praffull"));
		
		System.out.println(password.compareTo("Liverpool"));
		
		System.out.println(str.contains("walk")); //true
		System.out.println(str.startsWith("We")); //false
		System.out.println(str.endsWith("one")); //true
		
		String slogan="technology is power technology is future";
		System.out.println(slogan.indexOf("is"));
		System.out.println(slogan.indexOf("is",13));
		System.out.println(slogan.lastIndexOf('e'));
		
		System.out.println(slogan.replaceAll("technology","sports"));
		System.out.println(slogan);
		
		String[] arr=slogan.split(" ");
		for(String word:arr)
			System.out.println(word);
		
		String film="pk,2014,comedy,amir khan,hindi,8.7";
		arr=film.split(",");
		for(String word:arr)
			System.out.println(word);
		
		String city="   ";
		System.out.println(city.isEmpty());
		System.out.println(city.isBlank());
		
		System.out.println("-".repeat(10));
		
		String ps="chelsea786";
		System.out.println(ps.matches("[a-z]+\\d+"));
		
	}

}
