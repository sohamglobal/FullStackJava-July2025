
package com.sharayu.programs;
import java.util.*;
import java.sql.*;

public class TransferMoney {
	public static void main(String[] args) {
		int fromacc,toacc;
		float amount;
		String details;
		
		Scanner sc=new Scanner(System.in);
		
		Connection con;
		PreparedStatement pst;
		
		try
		{
			System.out.print("Enter from account number : ");
			fromacc=sc.nextInt();
			System.out.print("Enter to account number : ");
			toacc=sc.nextInt();
			System.out.print("Transfer amount : ");
			amount=sc.nextFloat();
			sc.nextLine();
			System.out.print("Description : ");
			details=sc.nextLine();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			
			pst=con.prepareStatement("update accounts set balance=balance-? where accno=?");
			pst.setFloat(1, amount);
			pst.setInt(2, fromacc);
			pst.executeUpdate();
			
			pst=con.prepareStatement("update accounts set balance=balance+? where accno=?");
			pst.setFloat(1, amount);
			pst.setInt(2, toacc);
			pst.executeUpdate();
			
			pst=con.prepareStatement("insert into translog(transdt,fromaccount,toaccount,amount,details) values(now(),?,?,?,?)");
			pst.setInt(1, fromacc);
			pst.setInt(2, toacc);
			pst.setFloat(3, amount);
			pst.setString(4, details);
			pst.executeUpdate();
						
			System.out.println("Transfer successful...");
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
