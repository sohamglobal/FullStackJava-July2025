package com.sharayu.programs;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(9, "praffull");
		tm.put(13, "sharayu");
		tm.put(26, "shailaja");
		tm.put(1, "soham");
		//tm.put(null,"megha"); not allowed
		tm.put(22, null);
		System.out.println(tm);
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		
	}

}
