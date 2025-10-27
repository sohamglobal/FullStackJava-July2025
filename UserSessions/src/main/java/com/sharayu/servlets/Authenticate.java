package com.sharayu.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import java.sql.*;

/**
 * Servlet implementation class Authenticate
 */
@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Authenticate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id,ps;
		id=request.getParameter("userid");
		ps=request.getParameter("password");
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanproject.e.aivencloud.com:13392/sharayudb?user=praffull&password=AVNS_B4YlxQuhu_n9zsNNNJ3");
			pst=con.prepareStatement("select * from users where userid=? and password=?");
			pst.setString(1, id);
			pst.setString(2, ps);
			rs=pst.executeQuery();
			if(rs.next())
			{
				System.out.println("login successful");
				//store data in the session
				HttpSession session=request.getSession(true);
				session.setAttribute("userid", id);
				
				response.sendRedirect("Customer.jsp");
			}
			else
			{
				System.out.println("authentication failed");
				response.sendRedirect("LoginFailed.html");
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("error in code "+e);
		}
		
		
	}

}
