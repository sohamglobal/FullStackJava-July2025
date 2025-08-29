package com.sharayu.programs;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(26);
		hs.add(45);
		hs.add(9);
		hs.add(13);
		//hs.add(9); duplicates not stored
		//hs.add(null); null allowed once
		hs.add(1);
		System.out.println(hs);
		
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			// hs.add(30); fail fast
		}
	}

}
