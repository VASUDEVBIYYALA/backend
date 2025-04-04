package com.service;

import com.model.Employee;

public interface Employeeservice {
	
	void addEmployee(Employee emp);
	void updateEmployee(Employee emp);
	void deleteEmployee(Employee emp);
	
	Employee finEmloyeebyid(int empid);

}
