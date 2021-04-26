package com.todo.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.todo.entity.User;
import com.todo.helper.FactoryProvider;

public class LoginDao {

	
	public boolean loginCheck(String userEmail,String pass) {
		
		
		Transaction transaction=null;
		User user=null;
		try
		{
			Session session=FactoryProvider.getSessionFactory().openSession();
			transaction=session.beginTransaction();
			
			user=(User)session.createQuery("FROM User U where U.email=:userEmail").setParameter("userEmail", userEmail)
					.uniqueResult();
			
			if(user!=null && user.getPassword().equals(pass))
			{
				return true;
			}
				transaction.commit();	
		}
		catch (Exception e) {
		
			if(transaction!=null) {
				
				transaction.rollback();
			}
			e.getMessage();
			
		}
		
		return false;
	}
}












//String url="";
//String username="root";
//String password="root";
//Connection connection;


//try {
//	Class.forName("com.mysql.jdbc.Driver");
//	connection=DriverManager.getConnection(url, userEmail, password);
//	String query="Select * from user where Email=? and password=?";
//	PreparedStatement pstmt=connection.prepareStatement(query);
//	pstmt.setString(1,userEmail);
//	pstmt.setString(2, pass);
//	ResultSet result=pstmt.executeQuery();
//	
//	while(result.next())
//	{
//		return true;
//	}
//
//} catch (ClassNotFoundException e) {
//System.out.println(e.getMessage());
//
//} catch (SQLException e) {
//System.out.println(e.getMessage());
//}
//return false;

