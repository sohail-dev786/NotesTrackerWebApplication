package com.todo.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.todo.entity.NoteTodo;
import com.todo.helper.FactoryProvider;

public class SaveNote extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SaveNote() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		try {

			String title = request.getParameter("title");
			String description = request.getParameter("description");
			
			System.out.println(title);
			System.out.println(description);
			
			
			NoteTodo todo=new NoteTodo(title, description, new Date());
			
			Session session=FactoryProvider.getSessionFactory().openSession();
			
			Transaction transaction=session.beginTransaction();
			
			session.save(todo);
			
			transaction.commit();
			session.close();
			
			
			out.println("<h2 "
					+ "style='color:green; text-align:center; margin-top:150px;font-size:30px; '>"
					+ "NOTES SUCCESSFULLY ADDED</h2>");
			
			out.println("<h2 style='color:blue; text-align:center; margin-top:160px;font-size:30px;'><a href='ShowNotes.jsp'>SHOW MY NOTES</a></h2>");
			
			//response.sendRedirect("index.jsp");
			
//			System.out.println(todo.getId());
//			System.out.println(todo.getTitle());
//			System.out.println(todo.getDescription());
//			System.out.println(todo.getAddedDate());

			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
