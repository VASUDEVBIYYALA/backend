package com.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Client {
	
	public static void main(String[] args) {
		
		EntityManagerFactory Factory = Persistence.createEntityManagerFactory("vasu");
		EntityManager entity = Factory.createEntityManager();
		
		entity.getTransaction().begin();
		
		Employee emp1 = new Employee(1,"Vasudev",5000,"hyd");
		Employee emp2 = new Employee(2,"raju",7000,"bng");
		Employee emp3 = new Employee(3,"ravi",9000,"ker");
		Employee emp4 = new Employee(4,"deva0",8000,"del");
		

		
		//inserting data into database
/*		entity.persist(emp1);
		entity.persist(emp2);
		entity.persist(emp3);
		entity.persist(emp4);
		entity.getTransaction().commit();
	*/	
		//ferch from data base
		Query q=entity.createQuery("select e from Employee e");
		List<Employee> li=q.getResultList();
		for(Employee e:li) {
			System.out.println("emp id"+e.getEmpid());
			System.out.println("\t emp name"+e.getEmpname());
			System.out.println("\t emp sal"+e.getEmpsal());
			System.out.println("\t emp add"+e.getEmpadd());
		}
		//conversion upper class
		Query q1=entity.createQuery("select UPPER(e.empname) from Employee e");
		List<String> li1=q1.getResultList();
		for(String name:li1) {
			System.out.println(name);
		}
		
		//max sal
		Query q2=entity.createQuery("select MAX(e.empsal) from Employee e");
		int maxval = (int) q2.getSingleResult();
		System.out.println("max sal is "+maxval);
		
		//salaries bw range
		Query q3=entity.createQuery("select e from Employee e where e.empsal between 3000 and 5000");
		List<Employee> li3=q3.getResultList();
		for(Employee ee:li3)
		{
			System.out.println("employee id :"+ee.getEmpid());
			System.out.println("EMployee salry :"+ee.getEmpsal());
		}
		
		//delete salary lessthan 7000
		
				Query q5=entity.createQuery("delete From Employee where empsal>7000");
				int dlted=q5.executeUpdate();
				System.out.println("deleted :"+dlted);
		entity.getTransaction().commit();
	}

}
