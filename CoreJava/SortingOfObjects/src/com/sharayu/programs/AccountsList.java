package com.sharayu.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.praffull.classes.Account;
import com.praffull.classes.AgeComparator;
import com.praffull.classes.NameComparator;
import com.praffull.classes.TypeComparator;

public class AccountsList {
	public static void main(String[] args) {
		List<Account> accList=new ArrayList<Account>();
		
		Account a1 = new Account(1001, "Vijay Kale", 28, "Saving", 25000.50);
        Account a2 = new Account(1002, "Priya Singh", 35, "Current", 50000.00);
        Account a3 = new Account(1003, "Amit Verma", 40, "Fixed", 150000.75);
        Account a4 = new Account(1004, "Neha Patel", 22, "Saving", 12000.00);
        Account a5 = new Account(1005, "Rakesh Gupta", 30, "Current", 35000.25);
        
        accList.add(a1);
        accList.add(a2);
        accList.add(a3);
        accList.add(a4);
        accList.add(a5);
        
        Collections.sort(accList,new NameComparator());
        System.out.println(accList);
        
        Collections.sort(accList,new AgeComparator());
        System.out.println(accList);
        
        Collections.sort(accList,new TypeComparator());
        System.out.println(accList);
	}

}
