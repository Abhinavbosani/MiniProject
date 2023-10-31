package com.Hibernate.car;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Display3 {
	public static void main(String[] args) {
		System.out.println( "Displaying the Car Details" );
		
			        
			        
			Configuration c = new Configuration();
			c.configure("hibernate.cfg.xml");
			        
		   SessionFactory factory = c.buildSessionFactory();
		   Session session=factory.openSession();
		   Transaction t = session.beginTransaction();
	       Query q=session.createQuery("select Manufacturer From CarDetails where Manufacturer like 'V%'");
		   List<String> l=q.list();
		   
		   System.out.println(l);
		   
		}
}
