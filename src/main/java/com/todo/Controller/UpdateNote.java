package com.todo.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.todo.entity.NoteTodo;
import com.todo.helper.FactoryProvider;

public class UpdateNote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateNote() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	PrintWriter out=response.getWriter();

	response.setContentType("text/html");

	int note_id = Integer.parseInt(request.getParameter("id").trim());

	String title = request.getParameter("title");

	String description = request.getParameter("description");
	
	
	Session session=FactoryProvider.getSessionFactory().openSession();
	Transaction  transaction=session.beginTransaction();
	
	NoteTodo noteTodo=session.get(NoteTodo.class, note_id);
	
	noteTodo.setTitle(title);
	noteTodo.setDescription(description);
	noteTodo.setAddedDate(new Date());
	
	transaction.commit();
	session.close();
	
	
	response.sendRedirect("ShowNotes.jsp");
	
	}

}
