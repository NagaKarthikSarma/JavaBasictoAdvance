package com.karthi.org.hibernate;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class HiberDb {

	public static void main(String[] args) {
		 SessionFactory factory= new Configuration()
                 .configure("hibernate.cfg.xml")
                  .addAnnotatedClass(Hotel.class)
                  .buildSessionFactory();
Session session = factory.getCurrentSession();
try {
	
//	Hotel ht = new Hotel(5,"sarma");
//	Transaction tx = session.beginTransaction();
//	session.save(ht);    // update also same save
	Transaction tx = session.beginTransaction();
	Hotel ht = new Hotel();
	
	Query<Hotel> q= session.createQuery("from Hotel");
	List<Hotel> list = q.list();
	Query<Hotel>  q1 = session.createQuery("from Hotel where id=2");
	Hotel h2= q1.getSingleResult();
	System.out.println(h2.getId()+"  --  "+h2.getCustomer());
	
	System.out.println("--------------------------");
	for(Hotel h: list) {
		System.out.println(h.getId()+"  --  "+h.getCustomer());
	}
	
	
	
	
	tx.commit();
	System.out.println("row added");
}
		finally {
			session.close();
		factory.close();
			
		}
		  

	}

}
