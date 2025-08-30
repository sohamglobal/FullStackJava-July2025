package com.sharayu.programs;

import java.util.TreeSet;

public class TreeSetAsNavigableSet {
	public static void main(String[] args) {
		
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		System.out.println(set);
		
		//Extra methods as a NavigableSet
		System.out.println(set.lower(25));
		System.out.println(set.higher(25));
		System.out.println(set.first());
		System.out.println(set.last());
		
		System.out.println(set.headSet(30)); //  <
		System.out.println(set.tailSet(30)); //  >=
		
		System.out.println(set.pollFirst()); // retrieve and remove 1st
		System.out.println(set);
		System.out.println(set.pollLast());
		System.out.println(set);
	}
	

}
