package com.sharayu.programs;

import java.util.LinkedList;

public class LinkedListLikeQueue {
	public static void main(String[] args) {
		LinkedList<String> sports=new LinkedList<String>();
		sports.add("football");
		sports.add("cricket");
		sports.add("F1 racing");
		
		sports.addFirst("wwe");
		sports.addLast("tennis");
		System.out.println(sports);
		sports.removeFirst();
		sports.removeFirstOccurrence("cricket");
		sports.removeLast();
		System.out.println(sports);
	}

}
