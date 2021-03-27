package com.todo.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {

	public static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null)
		{	
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}

		return sessionFactory;
	}
	
	//THIS METHOD WILL CALL AT THE TIME OF SESSION FACTORY CLOSE.
	public void closeFactory()
	{
		if(sessionFactory.isOpen())
		{
			sessionFactory.close();
		}
	}

}
