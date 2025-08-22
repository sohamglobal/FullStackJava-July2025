package com.sharayu.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListMoreFunctions {
	public static void main(String[] args) {
		ArrayList<String> players=new ArrayList<String>();
		players.add("mohammed salah");
		players.add("jos buttler");
		players.add("joe root");
		players.add("virgil van dijk");
		players.add("pat cummins");
		
		/*
		for(int i=0;i<players.size();i++)
			System.out.println(players.get(i));
		
		
		Iterator<String> it=players.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		*/
		System.out.println(players.contains("charles leclerc"));
		players.add(2, "ben stokes");
		
		for(String p:players)
			System.out.println(p);
		
		System.out.println("-------------");
		
		players.remove("joe root");
		Collections.reverse(players);
		System.out.println(players);
		
		Collections.sort(players);
		System.out.println(players);
		
		
	}

}
