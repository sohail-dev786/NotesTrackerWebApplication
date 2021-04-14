package com.todo.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.todo.entity.User;
import com.todo.helper.FactoryProvider;

public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserRegister() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("uemail");
		String pass=request.getParameter("upassword");
		
		
		User user=new User(fname, lname, email, pass);
		
		Session session=FactoryProvider.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(user);
		transaction.commit();
		System.out.println(user);
		
		session.close();
		
		response.sendRedirect("Login.jsp");
	}

}
