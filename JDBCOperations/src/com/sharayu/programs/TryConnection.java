package com.sharayu.programs;
import java.sql.*;

public class TryConnection {
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...");
			Connection con;
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			System.out.println("Connection to cloud DB successful");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
