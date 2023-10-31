package com.Hibernate.Flower;

import java.util.Scanner;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class RetriveData {

    public static void main( String[] args )
    {
        System.out.println( "project started" );
        
        
        Configuration c = new Configuration();
        c.configure("hibernate.cfg.xml");
        
        SessionFactory factory = c.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t = session.beginTransaction();
        
//        String id = new Scanner(System.in).nextLine();
        
        String str ="from FlowerBean";
        Query query = session.createQuery(str);
        List<FlowerBean> list = query.list();
        System.out.println();
        if (list.isEmpty()) {
            System.out.println("No FlowerBean found for the given id.");
        } else {
            for (FlowerBean fb : list) {
                System.out.println(fb); // Print each FlowerBean retrieved
            }
        }
        t.commit();
        session.close();
        factory.close();
       
    }
}
