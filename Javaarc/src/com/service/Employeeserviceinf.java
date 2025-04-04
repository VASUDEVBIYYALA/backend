package com.service;

import java.util.Map.Entry;

import com.model.Emplooyee;

import java.util.Set;

public interface Employeeserviceinf {
	
	int addemployee(Emplooyee emp);
	Emplooyee updateemployee(int empid, Emplooyee emp);
	Emplooyee getemployee(int empid);
	String deleteemployee(int empid);
	Set<Entry<Integer, Emplooyee>>getallemployee();

}
