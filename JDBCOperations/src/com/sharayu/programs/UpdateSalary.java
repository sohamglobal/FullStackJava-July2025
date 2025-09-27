package com.sharayu.programs;
import java.util.*;
import java.sql.*;

public class UpdateSalary {
	public static void main(String[] args) {
		int empno,cnt;
		float salary;
		Scanner sc=new Scanner(System.in);
		
		Connection con;
		PreparedStatement pst;
				
		try
		{
			System.out.print("Enter employee number : ");
			empno=sc.nextInt();
			System.out.print("Enter new salary : ");
			salary=sc.nextFloat();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			pst=con.prepareStatement("update employees set salary=? where empno=?");
			pst.setFloat(1, salary);
			pst.setInt(2, empno);
			cnt=pst.executeUpdate();
			if(cnt==1)
				System.out.println("Employee salary changed successfully...");
			else
				System.out.println("Employee NOT found...");
			
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
