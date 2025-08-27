package com.sharayu.programs;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<String>();
		ad.add("mumbai");
		ad.add("london");
		ad.add("nanded");
		ad.add("mumbai");
		//ad.add(null); not allowed
		ad.add("berlin");
		
		ad.addFirst("hyderabad");
		ad.addLast("dubai");
		System.out.println(ad);
		ad.removeFirst();
		System.out.println(ad);
		System.out.println(ad.peekFirst());
		System.out.println(ad);
		
		Iterator<String> it=ad.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			if(!ad.contains("new york"))
			ad.addLast("new york");
		}
		
		System.out.println(ad);
	}

}
