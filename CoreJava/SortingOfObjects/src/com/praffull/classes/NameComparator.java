package com.praffull.classes;

import java.util.Comparator;

public class NameComparator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return o1.getAccountName().compareTo(o2.getAccountName());
	}

}
