package com.sharayu.programs;
import java.sql.*;
import java.util.*;

public class DeleteAccount {
	public static void main(String[] args) {
		int accno;
		Scanner sc=new Scanner(System.in);
		
		Connection con;
		PreparedStatement pst;
		
		try
		{
			System.out.print("Enter account number to delete : ");
			accno=sc.nextInt();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			
			pst=con.prepareStatement("delete from accounts where accno=?");
			pst.setInt(1, accno);
			int cnt=pst.executeUpdate();
			if(cnt==1)
				System.out.println("Account deleted");
			else
				System.out.println("account not found");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();
	}

}
