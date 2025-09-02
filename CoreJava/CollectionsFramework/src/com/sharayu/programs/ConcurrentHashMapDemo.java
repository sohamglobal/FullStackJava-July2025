package com.sharayu.programs;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		//HashMap<String, String> users=new HashMap<String, String>();
		ConcurrentHashMap<String, String> users=new ConcurrentHashMap<String, String>();
		users.put("praffull", "chelsea");
		users.put("sharayu","spider");
		users.put("soham", "liverpool");
		users.putIfAbsent("shailaja", "youtube");
		//users.put(null, "crystal"); not allowed
		//users.put("buttler", null); not allowed
		System.out.println(users);
		
		for(String key:users.keySet())
		{
			System.out.println(key+"->"+users.get(key));
			users.put("ethan", "spring"); //no ConcurrentModificationException
		}
		System.out.println(users);
		
	}

}
