package com.dao;

import javax.persistence.EntityManager;

import com.model.Employee;

public class Employeedao implements Employeedaointf {
	
EntityManager entity;
	
	public Employeedao() {
		entity=JPAutil.getEntityManager();
	}

	@Override
	public Employee finEmloyeebyid(int empid) {
		Employee empobj = entity.find(Employee.class, empid);
		return empobj;
	}

	@Override
	public void addEmployee(Employee emp) {
		entity.persist(emp);
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		entity.merge(emp);
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		entity.remove(emp);
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entity.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entity.getTransaction().commit();
		
	}

	public Employee getEmployeebyID(int empid) {
		Employee empobj = entity.find(Employee.class, empid);
		return empobj;
		
	}

}
