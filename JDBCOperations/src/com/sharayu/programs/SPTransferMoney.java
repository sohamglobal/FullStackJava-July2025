/*
3] create a procedure to transfer money from one account to another with log

DELIMITER $$

create procedure transfer(IN fno int,IN tno int,IN amt float,IN det varchar(100))
begin
update accounts
set balance=balance-amt
where accno=fno;

update accounts
set balance=balance+amt
where accno=tno;

insert into translog
(transdt,fromaccount,toaccount,amount,details) 
values(now(),fno,tno,amt,det);
end$$

DELIMITER ;
 
 */


package com.sharayu.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.util.Scanner;

public class SPTransferMoney {
	public static void main(String[] args) {
		int fromacc,toacc;
		float amount;
		String details;
		
		Scanner sc=new Scanner(System.in);
		
		Connection con;
		CallableStatement cst;
		
		try
		{
			System.out.print("Enter from account number : ");
			fromacc=sc.nextInt();
			System.out.print("Enter to account number : ");
			toacc=sc.nextInt();
			System.out.print("Transfer amount : ");
			amount=sc.nextFloat();
			sc.nextLine();
			System.out.print("Description : ");
			details=sc.nextLine();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			
			cst=con.prepareCall("{call transfer(?,?,?,?)}");
			cst.setInt(1, fromacc);
			cst.setInt(2, toacc);
			cst.setFloat(3, amount);
			cst.setString(4, details);
			cst.executeUpdate();

			System.out.println("Transfer successful...");
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
