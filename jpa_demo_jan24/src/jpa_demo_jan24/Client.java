package jpa_demo_jan24;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Client {
	public static void main(String[] args) {
		EntityManagerFactory Factory = Persistence.createEntityManagerFactory("vasu");
		EntityManager entity = Factory.createEntityManager();
		entity.getTransaction().begin();
		Employee emp = new Employee(1,"vasudev",2345,"hyd");
		entity.persist(emp);
		entity.getTransaction().commit();
	}

}
