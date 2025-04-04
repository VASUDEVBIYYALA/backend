package com.service;


import org.dom4j.Entity;

import com.dao.Employeedao;
import com.dao.Employeedaointf;
import com.model.Employee;

public class EmployeeServices implements Employeeservice {

	Employeedao dao;
	
	public EmployeeServices() {
		dao= new Employeedao();
	}

	@Override
	public void addEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
	
		
	}

	

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.deleteEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public Employee finEmloyeebyid(int empid) {
		// TODO Auto-generated method stub
		Employee res=dao.getEmployeebyID(empid);
		return res;
	}
}
	
