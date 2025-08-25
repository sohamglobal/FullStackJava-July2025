package com.sharayu.programs;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> clubs=new Stack<String>();
		clubs.push("chelsea");
		clubs.push("liverpool");
		clubs.push("crystal palace");
		clubs.push("tottenham");
		//clubs.push("chelsea"); //allowed
		//clubs.push(null); //allowed
		clubs.push("arsenal");
		
		System.out.println(clubs);
		//System.out.println(clubs.get(3));
		System.out.println(clubs.pop());
		System.out.println(clubs);
		
		Iterator<String> it=clubs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			//clubs.add("aston villa"); //fail fast
		}
	}

}
