package com.sharayu.programs;

import java.util.Scanner;
import java.sql.*;

public class AccountTransactions {
	public static void main(String[] args) {
		int accno,cnt;
		float amount;
		String trans;
		Scanner sc=new Scanner(System.in);
		
		Connection con;
		PreparedStatement pst;
		
		try
		{
			System.out.print("Enter Deposit or Withdraw : ");
			trans=sc.nextLine();
			System.out.print("Enter account number : ");
			accno=sc.nextInt();
			System.out.print("Enter amount : ");
			amount=sc.nextFloat();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			
			if(trans.equalsIgnoreCase("deposit"))			
				pst=con.prepareStatement("update accounts set balance=balance+? where accno=?");
			else
				pst=con.prepareStatement("update accounts set balance=balance-? where accno=?");

			pst.setFloat(1, amount);
			pst.setInt(2, accno);
			cnt=pst.executeUpdate();
			if(cnt==1)
				System.out.println("Transaction successful...");
			else
				System.out.println("Transaction failed...");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();
	}

}
