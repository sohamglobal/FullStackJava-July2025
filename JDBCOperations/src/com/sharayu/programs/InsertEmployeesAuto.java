package com.sharayu.programs;
import java.sql.*;
import java.util.*;

public class InsertEmployeesAuto {
	public static void main(String[] args) {
		
		String empnm,dept,location;
		float salary;
		
		Connection con;
		PreparedStatement pst;
		Scanner sc = new Scanner(System.in);

		try
		{

			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			pst=con.prepareStatement("insert into employees(empnm,dept,location,salary) values(?,?,?,?)");
			
			
			
		System.out.print("Enter Employee Name: ");
        empnm = sc.nextLine();

        System.out.print("Enter Department: ");
        dept = sc.nextLine();

        System.out.print("Enter Location : ");
        location = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextFloat();

		pst.setString(1, empnm);
		pst.setString(2, dept);
		pst.setString(3, location);
		pst.setFloat(4, salary);
		pst.executeUpdate();
		System.out.println("Employee added successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
