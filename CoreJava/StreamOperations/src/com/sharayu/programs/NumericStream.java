package com.sharayu.programs;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class NumericStream {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(9,13,26,1,10,45,90,75,50);
		/*
		System.out.println(list);
		
		
		list.stream().forEach(System.out::println);
		
		list.stream().filter(n->n%2==1).forEach(n->System.out.println(n));
		
		
		List<Integer> sq=list.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println(sq);
		
		
		int sum=list.stream()
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println(sum);
		*/
		OptionalDouble a=list.stream()
				.mapToInt(Integer::intValue)
				.average();
		System.out.println(a);
	}

}
