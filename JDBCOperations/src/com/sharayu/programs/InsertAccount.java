package com.sharayu.programs;
import java.util.*;
import java.sql.*;

public class InsertAccount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int accno;
		String accnm,acctype;
		float balance;
		
		Connection con;
		PreparedStatement pst;
		
		try
		{
		System.out.print("Enter account number : ");
		accno=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name : ");
		accnm=sc.nextLine();
		System.out.print("Enter type : ");
		acctype=sc.nextLine();
		System.out.print("Enter balance : ");
		balance=sc.nextFloat();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
		pst=con.prepareStatement("insert into accounts values(?,?,?,?)");
		pst.setInt(1, accno);
		pst.setString(2, accnm);
		pst.setString(3, acctype);
		pst.setFloat(4, balance);
		pst.executeUpdate();
		System.out.println("new account created");
		con.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();
	}

}
