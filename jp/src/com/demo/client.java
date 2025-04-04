package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class client {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("vasu");
		EntityManager entity=factory.createEntityManager();
		
		entity.getTransaction().begin();
		Address add = new Address();
		add.setColonyname("dd colony");
		add.setState("tg");
		add.setPincode(500031);
		
		Employee emp = new Employee();
		emp.setEmpid(2);
		emp.setEmpname("vasu");
		emp.setEmpsal(101);
		emp.setAddress(add);
		
		entity.persist(emp);
		
	/*	Employee emp1=entity.find(Employee.class, 2);
		System.out.println(emp1);
		
		//update the data 
		emp1.setEmpsal(5000);;
		emp1.setEmpname("soma");
		
		emp1.getAddress().setState("Ap");;
		
		//entity.merge(emp1);
		
		entity.remove(emp1);
		
		
		*/
		entity.getTransaction().commit();
	}

}
