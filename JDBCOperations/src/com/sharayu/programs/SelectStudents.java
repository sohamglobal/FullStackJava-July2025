package com.sharayu.programs;
import java.sql.*;

public class SelectStudents {
	public static void main(String[] args) {
		Connection con;
		Statement st;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			st=con.createStatement();
			rs=st.executeQuery("select * from students");
			System.out.println("select query executed successfully");
			
			while(rs.next())
			{
				System.out.print(rs.getInt("regno")+" | ");
				System.out.print(rs.getString("studnm")+" | ");
				System.out.println(rs.getString("course"));
			}
			
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
