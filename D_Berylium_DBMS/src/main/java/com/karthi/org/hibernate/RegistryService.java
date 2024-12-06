package com.karthi.org.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class RegistryService {

	public static void main (String[] args) {
		
//		Configuration config = new Configuration().
//				                    configure("hibernate.cfg.xml")
//				                    .addAnnotatedClass(Restaurent.class);
//		
//		
//		ServiceRegistry registry = new StandardServiceRegistryBuilder()
//				                   .applySettings(config.getProperties())
//				                   .build();
//		
//	SessionFactory sf= config.buildSessionFactory(registry);
//	
//	Session session = sf.openSession();
//	try {
//	Transaction tx = session.beginTransaction();
//	
//	Restaurent rt1 = new Restaurent(1,"karthik");
//	session.save(rt1);
//	tx.commit();
//	System.out.println("Hello saved");
//	session.close();
//   sf.close();
//	}
//	finally {
//		
//	}
	
		
		
	}
}
