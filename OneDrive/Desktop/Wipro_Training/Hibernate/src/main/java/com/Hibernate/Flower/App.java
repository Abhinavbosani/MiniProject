package com.Hibernate.Flower;

import org.hibernate.Transaction;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Project Started");
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	FlowerBean f=new FlowerBean();
//    	f.setFlowerId("1");
//    	f.setColorString("Pink");
//    	f.setFlowerName("lilly");
//    	f.setPrice(10);
    	f.setFlowerId("3");
    	f.setColorString("yellow");
    	f.setFlowerName("hibiscus");
    	f.setPrice(20);
    	
    	System.out.println(f);
    	Session s=factory.openSession();
    	Transaction t=s.beginTransaction();
    	
    	s.save(f);
    	t.commit();
    	s.close();
    	
    	
    	
    	
//        System.out.println( "Hello World!" );
    }
}
