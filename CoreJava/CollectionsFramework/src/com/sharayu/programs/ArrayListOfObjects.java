package com.sharayu.programs;

import java.util.ArrayList;

import com.praffull.classes.Film;

public class ArrayListOfObjects {
	public static void main(String[] args) {
		Film f1=new Film("the matrix",1999,"action","english",8.7);
		Film f2=new Film("pk",2014,"comedy","hindi",8.9);
		Film f3=new Film("sholay",1975,"action","hindi",7.8);
		
		ArrayList<Film> films=new ArrayList<>();
		films.add(f1);
		films.add(f2);
		films.add(f3);
		
		//System.out.println(films);
		System.out.println("ArrayList size : "+films.size());
		for(int i=0;i<films.size();i++)
			System.out.println(films.get(i).getFilmName());
	}

}
