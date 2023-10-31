package com.Hibernate.Employee;

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
    	EmployeeBean emp=new EmployeeBean();
//    	f.setFlowerId("1");
//    	f.setColorString("Pink");
//    	f.setFlowerName("lilly");
//    	f.setPrice(10);
    	
//    	emp.setId(1);
    	emp.setDesg("Police");
    	emp.setName("Akhil");
    	emp.setSalary(100000);
    	
    	System.out.println(emp);
    	
    	Session s=factory.openSession();
    	Transaction t=s.beginTransaction();
    	
    	s.save(emp);
    	t.commit();
    	s.close();
    	
    	
    	
    	
//        System.out.println( "Hello World!" );
    }
}
