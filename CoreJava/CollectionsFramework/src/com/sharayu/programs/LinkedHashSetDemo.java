package com.sharayu.programs;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("java");
		lhs.add("spring");
		lhs.add("hibernate");
		lhs.add("jpa");
		//lhs.add("spring"); duplicate not stored
		//lhs.add(null); once
		lhs.add("rest api");
		
		System.out.println(lhs);
		
		Iterator<String> it=lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			//lhs.remove("jpa"); fail fast
		}
	}

}
