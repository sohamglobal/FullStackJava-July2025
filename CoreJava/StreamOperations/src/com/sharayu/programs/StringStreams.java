package com.sharayu.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStreams {
	public static void main(String[] args) {
		List<String> players=Arrays.asList(
				"Mohamed Salah","Virgil van Dijk","Alexander Isak",
				"Dominik Szoboszlai","Chris Wood","Bukayo Saka",
				"Declan Rice","Erling Haaland","Darwin Nunez",
				"Mohamed Salah","Bukayo Saka" //duplicates
				);
		//System.out.println(players);
		//players.stream().forEach(p->System.out.println(p));
		//players.stream().forEach(System.out::println);
		/*
		players.stream()
					.filter(p->p.startsWith("D")) //intermediate operation
					.forEach(p->System.out.println(p)); //terminal operation
		
		
		List<String> result=players.stream()
								.filter(p->p.length()>12)
								.collect(Collectors.toList());
		System.out.println(result);
		
		
		players.stream()
					.map(p->p.toUpperCase())
					.forEach(p->System.out.println(p));
		
		
		players.stream()
					.map(p->p.substring(0, 4))
					.forEach(p->System.out.println(p));
		
		List<String> sorted=players.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		
		//remove duplicated from the arraylist
		players.stream()
					.distinct()
					.forEach(System.out::println);
		
		
		boolean status=players.stream()
				.anyMatch(p->p.toLowerCase().contains("win"));
		System.out.println(status);
		
		
		boolean stat=players.stream()
				.allMatch(p->p.contains(" "));
		System.out.println(stat);
		
		players.stream()
				.sorted().skip(2).limit(5)
				.forEach(p->System.out.println(p));
				
				*/
		long cnt=players.stream()
					.filter(p->p.contains("o"))
					.count();
		System.out.println(cnt);
	}

}
