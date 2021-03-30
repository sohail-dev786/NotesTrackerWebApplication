package com.todo.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.todo.entity.NoteTodo;
import com.todo.helper.FactoryProvider;

public class DeleteNote extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteNote() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		int note_id = Integer.parseInt(request.getParameter("note_id").trim());

//		System.out.println(note_id);

		Session sess = FactoryProvider.getSessionFactory().openSession();

		NoteTodo mynotes = sess.get(NoteTodo.class, note_id);

		Transaction transaction1=sess.beginTransaction();
		
		sess.delete(mynotes);
		
		transaction1.commit();

		sess.close();
		
		response.sendRedirect("ShowNotes.jsp");
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
