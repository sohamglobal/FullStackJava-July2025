package com.sharayu.programs;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> tech=new Vector<String>();
		tech.add("java");
		tech.add("python");
		tech.add("sql");
		tech.add("java");
		//tech.add(null); allowed
		tech.add("mongodb");
		tech.remove(3);
		System.out.println(tech);
		Iterator<String> it=tech.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			//tech.add("langchain"); fail fast
		}
	}

}
