package com.sharayu.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class BasicStreamOperations {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("java");
		list.add("python");
		list.add("spring boot");
		list.add("spark");
		list.add("hibernate");
		list.add("jpa");
		
		//System.out.println(list);
		
		/*
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
			
		
		Iterator<String> it=list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		
		for(String nm:list)
			System.out.println(nm);
		*/
		
		list.stream().forEach(nm->System.out.println(nm));
		//stream represents a sequence of elements from the collection
		//print, filter, transform, aggregate, sort
		//1. readable declarative code 
		//2. less boilerplate code
		//3. efficient processing -> lazy
		//4. parallel
		//5. functional style -> clean and modern
		System.out.println("-----------");
		//list.stream().filter(nm->nm.startsWith("s")).forEach(nm->System.out.println(nm));
		list.stream().filter(nm->nm.length()>5).forEach(nm->System.out.println(nm));
		//data pipeline
		
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(9);
		nums.add(13);
		nums.add(26);
		nums.add(1);
		nums.add(10);
		nums.add(45);
		nums.add(30);
		System.out.println("------------------");
		//nums.stream().forEach(n->System.out.println(n));
		//nums.stream().filter(n->n%2==1).forEach(n->System.out.println(n));
		nums.stream().filter(n->n>10).forEach(n->System.out.println(n));
		
	}

}
