package com.sharayu.programs;

public class StringBufferFunctions {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		
		sb.append(" from sohamglobal LIVE online on teams");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.append(" praffull");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.indexOf("L"));
		
		sb.insert(23, "technologies ");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		
		
		sb.delete(15, 38);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		
		sb.reverse();
		System.out.println(sb);
	}

}
