package com.sharayu.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.praffull.services.AuthenticationService;

/**
 * Servlet implementation class CheckCode
 */
@WebServlet("/CheckCode")
public class CheckCode extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckCode() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int code;
		code=Integer.parseInt(request.getParameter("entcode"));
		AuthenticationService obj=new AuthenticationService();
		obj.setCode(code);
		String status=obj.getStatus();
		
		if(status.equals("success"))
			response.sendRedirect("UserContent.jsp");
		else
			response.sendRedirect("Failure.jsp");
		
	}

}
