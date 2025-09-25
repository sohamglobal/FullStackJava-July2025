package com.sharayu.programs;
import java.sql.*;

public class SelectAccounts {
	public static void main(String[] args) {
		Connection con;
		Statement st;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			st=con.createStatement();
			rs=st.executeQuery("select * from accounts where acctype='ppf'");
			
			while(rs.next())
			{
				System.out.println(rs.getString("accnm"));
			}
			con.close();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver not found");
		}
		catch(SQLException e)
		{
			System.out.println("Something wrong with SQL");
		}
	}

}
