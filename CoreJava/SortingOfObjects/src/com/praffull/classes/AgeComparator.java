package com.praffull.classes;

import java.util.Comparator;

public class AgeComparator implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}

}
