package com.Hibernate.Product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate.Product.ProductBean;

public class App {
	public static void main(String[] args) {
		System.out.println("Project Started");
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	ProductBean p=new ProductBean();
    	p.setPrice(10);
    	p.setProductId(1);
    	p.setProductName("Pen");
           
    	System.out.println(p);
    	
    	Session s=factory.openSession();
    	Transaction t=s.beginTransaction();
    	
    	s.save(p);
    	t.commit();
    	s.close();
    	
	}

}
