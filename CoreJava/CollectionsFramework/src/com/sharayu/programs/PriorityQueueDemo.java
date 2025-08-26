package com.sharayu.programs;


import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(23);
		pq.add(75);
		pq.add(9);
		//pq.add(null); not allowed
		pq.add(13);
		pq.add(45);
		pq.add(75);
		System.out.println("-----MIN HEAP----");
		
		System.out.println(pq);
		System.out.println("-----Max Heap---------");
		PriorityQueue<Integer> pqmax=new PriorityQueue<>(Comparator.reverseOrder());
		pqmax.add(23);
		pqmax.add(75);
		pqmax.add(9);
		pqmax.add(13);
		pqmax.add(45);
		pqmax.add(75);
		
		System.out.println(pqmax);
	}

}
