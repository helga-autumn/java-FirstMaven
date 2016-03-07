package entity;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import mysql1.Buyer;
import mysql1.Orders;



public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Buyer b = new Buyer();
		b.setFirstName("Rostislav");
		em.persist(b);
		
		Orders orders = new Orders();
		orders.setBuyer(b);
		
		em.persist(orders);

		b = em.find(Buyer.class, 1);
		for(Orders o : buyer.getOrders(){
		Orders o;
		System.out.println(o.getBuyer());
		
		EntityManager em;
		em.getTransaction().commit();
		em.close();
		EntityManager factory;
		factory.close();
		

	}

}


