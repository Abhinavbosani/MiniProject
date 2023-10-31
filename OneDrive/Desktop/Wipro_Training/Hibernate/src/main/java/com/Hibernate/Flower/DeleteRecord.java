package com.Hibernate.Flower;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DeleteRecord {
public static void main(String args[]) {
	
	Configuration c= new Configuration();
	c.configure("hibernate.cfg.xml");
	
	SessionFactory factory = c.buildSessionFactory();
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	
	String id=new Scanner(System.in).nextLine();
//	FlowerBean fb= session.get(FlowerBean.class, id);
	try {
	FlowerBean fb= session.load(FlowerBean.class, id);
	if(fb != null) {
		session.delete(fb);
		System.out.println("deleted");
	}}
	
	catch(Exception e) {
		System.out.println("not found");
	}
	
	
	
	
	transaction.commit();
	session.close();
}
}
