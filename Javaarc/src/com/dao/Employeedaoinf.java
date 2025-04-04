package com.dao;

import java.util.Set;
import java.util.Map.Entry;

import com.model.Emplooyee;

public interface Employeedaoinf {
	
	int addemployee(Emplooyee emp);
	Emplooyee updateemployee(int empid, Emplooyee emp);
	Emplooyee getemployee(int empid);
	String deleteemployee(int empid);
	Set<Entry<Integer, Emplooyee>>getallemployee();


}
