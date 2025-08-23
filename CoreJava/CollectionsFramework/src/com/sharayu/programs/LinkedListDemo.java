package com.sharayu.programs;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> cities=new LinkedList<>();
		cities.add("london");
		cities.add("mumbai");
		cities.add("dubai");
		cities.add("karachi");
		cities.add("tokyo");
		cities.add("mumbai");
		cities.add(null);
		cities.add(4, "chicago");
		cities.remove(null);
		System.out.println(cities);
		
		Iterator<String> it=cities.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			//cities.add("berlin"); fail fast
		}
		
		
	}
	

}
