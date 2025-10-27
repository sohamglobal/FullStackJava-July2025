package com.sharayu.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.*;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		
		String uid,ps,nm,occ,mob;
		uid=request.getParameter("userid");
		ps=request.getParameter("password");
		nm=request.getParameter("fullname");
		occ=request.getParameter("occupation");
		mob=request.getParameter("mobile");
		
		//out.println(uid+"  "+nm+"  "+mob);
		
		
		Connection con;
		PreparedStatement pst;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			pst=con.prepareStatement("insert into users values(?,?,?,?,?)");
			pst.setString(1, uid);
			pst.setString(2,ps);
			pst.setString(3,nm);
			pst.setString(4,occ);
			pst.setString(5,mob);
			pst.executeUpdate();
			con.close();
			out.println("<h2>User Registration Successful</h2><hr>");
			out.println("<a href='index.html'>Login Now</a>");
			
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
		
	}

}
