package com.dao;

import com.model.Employee;

public interface Employeedaointf {
	
	Employee finEmloyeebyid(int empid);

	void addEmployee(Employee emp);
	void updateEmployee(Employee emp);
	void deleteEmployee(Employee emp);
	
	void beginTransaction();
	void commitTransaction();
	
	

}
