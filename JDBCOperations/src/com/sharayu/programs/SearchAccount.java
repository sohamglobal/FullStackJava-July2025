package com.sharayu.programs;

import java.util.Scanner;
import java.sql.*;

public class SearchAccount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int accno;
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			pst=con.prepareStatement("select * from accounts where accno=?");
			
			do
			{
				System.out.print("Enter account number to search : ");
				accno=sc.nextInt();
				pst.setInt(1, accno);
				rs=pst.executeQuery();
				if(rs.next())
				{
					System.out.println(rs.getString("accnm")+" | "+rs.getFloat("balance"));
				}
				else
					System.out.println("Account does not exist");
				
			}
			while(accno>0);

			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	sc.close();
	}

}
