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
	}

}
