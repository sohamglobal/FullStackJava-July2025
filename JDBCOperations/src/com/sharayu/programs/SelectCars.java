package com.sharayu.programs;
import java.sql.*;

public class SelectCars {
	public static void main(String[] args) {
		Connection con;
		Statement st;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			st=con.createStatement();
			//rs=st.executeQuery("select * from cars");
			//rs=st.executeQuery("select * from cars where company='skoda'");
			rs=st.executeQuery("select * from cars where price<650000");
			
			while(rs.next())
			{
				System.out.println(rs.getString("modelnm"));
			}
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
