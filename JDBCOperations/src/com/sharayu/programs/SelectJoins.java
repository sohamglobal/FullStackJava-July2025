package com.sharayu.programs;
import java.sql.*;

public class SelectJoins {
	public static void main(String[] args) {
		Connection con;
		Statement st;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			
			st=con.createStatement();
			rs=st.executeQuery("select customers.custnm,customers.city,cars.modelnm,cars.company,cars.price from customers inner join cars on customers.carid=cars.carid");
			
			while(rs.next())
			{
				System.out.print(rs.getString("custnm")+" | ");
				System.out.print(rs.getString("city")+" | ");
				System.out.print(rs.getString("modelnm")+" | ");
				System.out.print(rs.getString("company")+" | ");
				System.out.println(rs.getString("price"));
			}
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
