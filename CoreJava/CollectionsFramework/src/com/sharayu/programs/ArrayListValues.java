package com.sharayu.programs;
import java.util.*;

public class ArrayListValues {
	public static void main(String[] args) {
		ArrayList<String> lst=new ArrayList<String>(15);
		lst.add("java");
		lst.add("spring");
		lst.add("rest");
		lst.add("hibernate");
		lst.add(null);
		lst.add("jpa");
		
		System.out.println(lst);
		
		Iterator<String> iterator=lst.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			//lst.add("AI agents"); //fail fast
		}
		
		
		
		ArrayList<Integer> nums=new ArrayList<>();
		//int->Integer, float->Float, double->Double
		nums.add(9);
		nums.add(13);
		nums.add(26);
		nums.add(45);
		nums.add(13);
		nums.add(1);
		System.out.println(nums);
	}

}
