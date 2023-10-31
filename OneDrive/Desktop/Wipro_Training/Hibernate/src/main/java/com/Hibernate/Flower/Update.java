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
public class Update {

    public static void main( String[] args )
    {
        System.out.println( "project started" );
        
        
        Configuration c = new Configuration();
        c.configure("hibernate.cfg.xml");
        
        SessionFactory factory = c.buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction = session.beginTransaction();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Flower Id:");
        String id =sc.nextLine();
        System.out.println("Enter new Price of Flower:");
        int p=sc.nextInt();
        
         
        FlowerBean fb = session.get(FlowerBean.class, id);

        if (fb != null) {
        	
            fb.setPrice(p);
            
            transaction.commit();
            
            System.out.println("Object updated successfully."+ fb);
        } else {
            System.out.println("Object not found.");
        }

        session.close();
        factory.close();
    }
}
 