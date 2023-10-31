package com.Hibernate.car;


import  org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Car_App {

    public static void main( String[] args )
    {
        System.out.println( "project started" );
        
        
        Configuration c = new Configuration();
        c.configure("hibernate.cfg.xml");
        
        SessionFactory factory = c.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t = session.beginTransaction();
        
        CarDetails c1 = new CarDetails();
        CarDetails c2 = new CarDetails();
        CarDetails c3 = new CarDetails();
        
        MultiCarOwner mo = new MultiCarOwner(12,"tharun");    
       
        c1.setRegNo("KL-07");
        c2.setRegNo("KL-07");
        c3.setRegNo("KL-07");
        
        c1.setModel("AB 123 Polo");
        c2.setModel("AB 123 Vento");
        c3.setModel("AB 123 Corolla");
        
        c1.setColor("White");
        c2.setColor("Black");
        c3.setColor("Silver");
        
        c1.setManufacturer("Volkswagen");
        c2.setManufacturer("Volkswagen");
        c3.setManufacturer("Toyota");
        
        c1.setMco(mo);
        c2.setMco(mo);
        c3.setMco(mo);
        
        mo.getCar().add(c1);
        mo.getCar().add(c2);
        
        session.save(c1);
        session.save(c2);
        session.save(c3);
     
        session.save(mo);
        
        t.commit();
        
        session.close();
        factory.close();
        
        System.out.println(" sucess !! ");
        System.out.println(c1);
    }
}



