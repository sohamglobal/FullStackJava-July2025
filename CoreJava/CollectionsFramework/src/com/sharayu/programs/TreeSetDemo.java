package com.sharayu.programs;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> names=new TreeSet<String>();
		names.add("sharayu");
		names.add("buttler");
		names.add("root");
		names.add("stokes");
		names.add("cummins");
		// names.add("root"); duplicates not stored
		// names.add(null); not allowed
		names.add("praffull");
		System.out.println(names);
	}

}
