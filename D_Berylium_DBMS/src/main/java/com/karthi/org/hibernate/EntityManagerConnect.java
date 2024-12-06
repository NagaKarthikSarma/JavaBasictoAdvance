package com.karthi.org.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class EntityManagerConnect {

	public static void main(String[] args) {
		EntityManagerFactory ef= null;
		EntityManager em= null;
		EntityTransaction et= null;
try {
	ef=Persistence.createEntityManagerFactory("karthik");
	em=ef.createEntityManager();
	et=em.getTransaction();
	TypedQuery<Hotel> query=em.createQuery("from Hotel",Hotel.class);
	List<Hotel> list= query.getResultList();
	for(Hotel h: list) {
		System.out.println(h.getId()+"  --  "+h.getCustomer());
	}
}
finally {
	
}


	}

}
