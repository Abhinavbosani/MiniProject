package com.Hibernate.Employee;

import  org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Emp_Passport {
    public static void main( String[] args ){
    	
        System.out.println( "project started" );
        
        
        Configuration c = new Configuration();
        c.configure("hibernate.cfg.xml");
        
        SessionFactory factory = c.buildSessionFactory();
        Session s=factory.openSession();
        Transaction t = s.beginTransaction();
        
        EmployeeBean e1 = new EmployeeBean(100,"tester","Tharun",20000);
        Passport p1=new Passport();
        p1.setPassId("123#");
//        e1.setPass(p1);
        p1.setEmp(e1);
        s.save(e1);
        s.save(p1);
        
        t.commit();
        
        s.close();
        
        System.out.println(" sucess !! ");
        System.out.println(e1);
        System.out.println();
        System.out.println(p1);
    }
}
