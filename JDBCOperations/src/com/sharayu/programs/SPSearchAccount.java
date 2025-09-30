/*
 2] Create procedure to retrieve data of specified account

DELIMITER $$

create procedure selacc(IN ano int)
begin
select accnm,acctype,balance
from accounts
where accno=ano;
end$$

DELIMITER ;

*/

package com.sharayu.programs;
import java.util.*;
import java.sql.*;

public class SPSearchAccount {
	public static void main(String[] args) {
		int accno;
		Scanner sc=new Scanner(System.in);
		
		Connection con;
		CallableStatement cst;
		ResultSet rs;
		
		
		try
		{
			System.out.print("Enter account number to search : ");
			accno=sc.nextInt();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			
			cst=con.prepareCall("{call selacc(?)}");
			cst.setInt(1, accno);
			
			rs=cst.executeQuery();
			if(rs.next())
			{
				System.out.println(rs.getString("accnm"));
				System.out.println(rs.getString("acctype"));
				System.out.println(rs.getFloat("balance"));
			}
			else
				System.out.println("not found");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
