package com.sharayu.programs;
import java.util.*;
import java.sql.*;

public class InsertStudent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int regno;
		String studnm,course;
		
		Connection con;
		PreparedStatement pst;
		
		try
		{
		//take input from user
		System.out.print("Enter registration number : ");
		regno=sc.nextInt();
		sc.nextLine(); // to skip
		System.out.print("Enter student name : ");
		studnm=sc.nextLine();
		System.out.print("Enter course : ");
		course=sc.nextLine();
		
		//JDBC
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
		pst=con.prepareStatement("insert into students values(?,?,?)");
		pst.setInt(1, regno);
		pst.setString(2, studnm);
		pst.setString(3,course);
		pst.executeUpdate();
		System.out.println("New student added to DB");	
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		sc.close();
	}

}
