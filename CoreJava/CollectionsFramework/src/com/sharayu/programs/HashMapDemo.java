package com.sharayu.programs;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1724, "praffull");
		hm.put(5241, "sharayu");
		hm.put(6311, "soham");
		//hm.put(1724, "shailaja"); duplicate key not maintained
		hm.put(null, "megha");
		hm.put(1122, null);
		hm.put(7366, null);
		System.out.println(hm);
	}

}
