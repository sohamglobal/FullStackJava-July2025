package com.sharayu.programs;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> countries=new LinkedHashMap<Integer, String>();
		countries.put(404, "India");
		countries.put(310,"USA");
		countries.put(234,"UK");
		countries.put(505,"Australia");
		countries.put(262,"Germany");
		countries.put(440,"Japan");
		countries.put(null,"Italy");
		countries.put(786,null);
		System.out.println(countries);
		
	}

}
