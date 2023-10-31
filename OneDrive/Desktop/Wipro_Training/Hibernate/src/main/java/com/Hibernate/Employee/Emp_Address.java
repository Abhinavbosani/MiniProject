package com.Hibernate.Employee;


import  org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Emp_Address {
    public static void main( String[] args ){
    	
        System.out.println( "project started" );
        
        
        Configuration c = new Configuration();
        c.configure("hibernate.cfg.xml");
        
        SessionFactory factory = c.buildSessionFactory();
        Session s=factory.openSession();
        Transaction t = s.beginTransaction();
        
        EmployeeBean e1 = new EmployeeBean(100,"tester","Abhinav",20000);
        Address a1= new Address(123123,"hyd","hyd","Telangana","501501");
        
        e1.setAdd(a1);
        
        
        s.save(e1);
        s.save(a1);
        
        t.commit();
        
        s.close();
        
        System.out.println(" sucess !! ");
        System.out.println(e1);
        System.out.println();
        System.out.println(a1);
    }
}
