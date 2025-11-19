package com.sohamglobal.jdbc07.services;

import org.springframework.stereotype.Service;

import com.sohamglobal.jdbc07.dtos.Account;
import java.sql.*;


@Service
public class AccountServices {
	
	
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	private Account obj;
	
	
	//constructor function
	public AccountServices()
	{
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public String addAccount(Account acc)
	{
		
		String status="";
		
		try
		{
			pst=con.prepareStatement("insert into accounts values(?,?,?,?)");
			pst.setInt(1,acc.getAccno());
			pst.setString(2, acc.getAccnm());
			pst.setString(3, acc.getAcctype());
			pst.setFloat(4, acc.getBalance());
			pst.executeUpdate();
			//con.close();
			status="success";
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			status=e.getMessage();
		}
		
		
		return status;
	}
	
	public Account searchAccount(int accno)
	{
		
		try
		{
			pst=con.prepareStatement("select * from accounts where accno=?");
			pst.setInt(1, accno);
			rs=pst.executeQuery();
			obj=new Account();
			if(rs.next())
			{
				obj.setAccno(accno);
				obj.setAccnm(rs.getString("accnm"));
				obj.setAcctype(rs.getString("acctype"));
				obj.setBalance(rs.getFloat("balance"));
			}
			else
			{
				obj.setAccno(accno);
				obj.setAccnm("not found");
				obj.setAcctype("not found");
				obj.setBalance(0);
			}
			//con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return obj;
	}
	
	

}
