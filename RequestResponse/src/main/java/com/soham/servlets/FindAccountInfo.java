package com.soham.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.*;

/**
 * Servlet implementation class FindAccountInfo
 */
@WebServlet("/FindAccountInfo")
public class FindAccountInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindAccountInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int no;
		no=Integer.parseInt(request.getParameter("ano"));
		
		out.println("<h2>Account Info : "+no+"</h2><hr>");
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			pst=con.prepareStatement("select * from accounts where accno=?");
			pst.setInt(1, no);
			rs=pst.executeQuery();
			if(rs.next())
			{
				out.println("<br>Name    : "+rs.getString("accnm"));
				out.println("<br>Type    : "+rs.getString("acctype"));
				out.println("<br>Balance : "+rs.getString("balance"));
			}
			else
				out.println("Account does not exist");
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
	}

}
