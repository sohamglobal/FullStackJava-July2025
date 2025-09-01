package com.sharayu.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K, V> {
	
	private final int capacity;
	
	public LRUCache(int capacity)
	{
		super(capacity,0.75f,true);
		this.capacity=capacity;
	}
	
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size()>capacity;
	}
	
	public static void main(String[] args) {
		LRUCache<Integer,String> cache=new LRUCache(3);
		cache.put(1, "praffull");
		cache.put(2, "sharayu");
		cache.put(3, "soham");
		System.out.println(cache.get(1));
		cache.put(4, "shailaja");
		System.out.println(cache);
	}

}
