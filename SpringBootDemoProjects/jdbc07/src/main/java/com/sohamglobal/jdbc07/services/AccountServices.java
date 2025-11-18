package com.sohamglobal.jdbc07.services;

import org.springframework.stereotype.Service;

import com.sohamglobal.jdbc07.dtos.Account;
import java.sql.*;


@Service
public class AccountServices {
	
	public String addAccount(Account acc)
	{
		Connection con;
		PreparedStatement pst;
		String status="";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			pst=con.prepareStatement("insert into accounts values(?,?,?,?)");
			pst.setInt(1,acc.getAccno());
			pst.setString(2, acc.getAccnm());
			pst.setString(3, acc.getAcctype());
			pst.setFloat(4, acc.getBalance());
			pst.executeUpdate();
			con.close();
			status="success";
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			status=e.getMessage();
		}
		
		
		return status;
	}

}
