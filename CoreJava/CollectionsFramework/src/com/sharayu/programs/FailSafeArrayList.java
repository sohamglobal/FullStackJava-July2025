package com.sharayu.programs;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeArrayList {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> lst=new CopyOnWriteArrayList<String>();
		lst.add("chelsea");
		lst.add("liverpool");
		lst.add("arsenal");
		lst.add("crystal palace");
		
		Iterator<String> it=lst.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			if(!lst.contains("tottenham"))
			lst.add("tottenham");
		}
		
		System.out.println(lst);
	}

}
