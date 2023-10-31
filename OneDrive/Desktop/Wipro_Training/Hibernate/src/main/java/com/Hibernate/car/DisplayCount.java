package com.Hibernate.car;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DisplayCount {
	public static void main(String[] args) {
		System.out.println( "Displaying the Car Details" );
		
			        
			        
			Configuration c = new Configuration();
			c.configure("hibernate.cfg.xml");
			        
		   SessionFactory factory = c.buildSessionFactory();
		   Session session=factory.openSession();
		   Transaction t = session.beginTransaction();
	       CriteriaBuilder cb=session.getCriteriaBuilder();
	       CriteriaQuery<CarDetails> cr=cb.createQuery(CarDetails.class);
	       Root<CarDetails> root=cr.from(CarDetails.class);
	       cr.select(root);
	       Predicate p=cb.equal(root.get("RegNo"),"KL-07");
	       cr.where(p);
	       Query<CarDetails> q=session.createQuery(cr);
	       List<CarDetails> l=q.list();
	       System.out.println("The total number of cars are: "+l.size());
	       
		   
		   
		}

}
