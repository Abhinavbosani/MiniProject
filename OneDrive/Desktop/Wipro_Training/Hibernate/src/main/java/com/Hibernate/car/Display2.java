package com.Hibernate.car;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Display2 {
	public static void main(String[] args) {
	System.out.println( "Displaying the Car Details" );
	
		        
		        
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		        
	   SessionFactory factory = c.buildSessionFactory();
	   Session session=factory.openSession();
	   Transaction t = session.beginTransaction();
       Query<CarDetails> q=session.createQuery("From CarDetails");
	   List<CarDetails> l=q.list();
	   System.out.print("Regno     ");
	   System.out.println("Manufacturer");
	   System.out.println("---------------------");
	   
	   
	   for (CarDetails carDetails : l) {
		   System.out.println(carDetails.getRegNo()+"  |  "+carDetails.getManufacturer());
		
	}
	   
	}
}
