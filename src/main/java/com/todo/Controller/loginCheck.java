package com.todo.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public loginCheck() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
	
		String uemail=request.getParameter("uemail");
		String upass=request.getParameter("upass");
		
		System.out.println(uemail);
		System.out.println(upass);
		
		
		if(uemail.equals("Sohail@gmail.com")&& upass.equals("123"))
		{
			request.getSession().setAttribute("userEmail", uemail);
			response.sendRedirect("index.jsp");
		}
		else
		{
			response.sendRedirect("Login.jsp");
		}

		
		   



	
	}

}
