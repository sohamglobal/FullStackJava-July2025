package com.sharayu.programs;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> players=new Hashtable<Integer, String>();
		players.put(66, "joe root");
		players.put(11, "mohammed salah");
		players.put(63, "jos buttler");
		players.put(4, "virgil van dijk");
		//order is not guaranteed
		//players.put(11, "praffull"); duplicate keys not stored
		players.put(75, "joe root"); //fine
		//players.put(9, null); not allowed
		//players.put(null, "sharayu"); not allowed
		System.out.println(players);
		
		System.out.println(players.get(4));
		System.out.println(players.remove(75));
		System.out.println(players);
		
		System.out.println(players.containsKey(11));
		if(players.containsKey(11))
			System.out.println(players.get(11));
		
		System.out.println(players.containsValue("pat cummins"));
		
		Enumeration<Integer> enumKeys = players.keys();
		while (enumKeys.hasMoreElements()) {
            System.out.println(enumKeys.nextElement());  // Output each element
        }
		
		Enumeration<String> enumVals = players.elements();
		while (enumVals.hasMoreElements()) {
            System.out.println(enumVals.nextElement());  // Output each element
        }

	}

}
