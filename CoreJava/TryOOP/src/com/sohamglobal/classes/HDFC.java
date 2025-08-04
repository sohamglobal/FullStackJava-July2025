package com.sohamglobal.classes;
import com.praffull.interfaces.*;

public class HDFC implements Bank,Finance{
	
	public void welcome()
	{
		System.out.println("Welcome to HDFC");
	}

	@Override
	public void findEMI(float loanamt, int months) {
		// TODO Auto-generated method stub
		float emi=(loanamt+loanamt*12/100)/months;
		System.out.println("EMI will be "+emi);
	}

	@Override
	public void calcInterest(float amount) {
		// TODO Auto-generated method stub
		float interest=amount*5/100;
		System.out.println("Interest after 1 year will be "+interest);
	}

	@Override
	public void showRates() {
		// TODO Auto-generated method stub
		System.out.println("Interest rates in HDFC");
		System.out.println("Saving : 3%");
		System.out.println("Fixed : 5%");
	}

	
}
