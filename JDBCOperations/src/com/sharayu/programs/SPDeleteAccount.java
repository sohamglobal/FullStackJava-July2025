/*
 1] Create a procedure to delete specified account

DELIMITER $$

create procedure delacc(IN ano int)
begin
delete from accounts
where 
accno=ano;
end$$

DELIMITER ;

*/

package com.sharayu.programs;

import java.sql.*;
import java.util.Scanner;

public class SPDeleteAccount {
	
	public static void main(String[] args) {
		int accno;
		Scanner sc=new Scanner(System.in);
		
		Connection con;
		CallableStatement cst;
		
		try
		{
			System.out.print("Enter account number to delete : ");
			accno=sc.nextInt();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			
			cst=con.prepareCall("{call delacc(?)}");
			cst.setInt(1, accno);
			int cnt=cst.executeUpdate();
			if(cnt==1)
				System.out.println("Account deleted");
			else
				System.out.println("account not found");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();
	}


}
