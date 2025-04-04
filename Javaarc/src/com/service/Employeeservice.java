package com.service;

import java.util.Map.Entry;
import java.util.Set;

import com.dao.Employeedao;
import com.dao.Employeedaoinf;
import com.model.Emplooyee;

public class Employeeservice implements Employeeserviceinf {
	
	Employeedaoinf dao  = new Employeedao();
	@Override
	public int addemployee(Emplooyee emp) {
		
		
		return dao.addemployee(emp);
	}

	@Override
	public Emplooyee updateemployee(int empid, Emplooyee emp) {
		// TODO Auto-generated method stub
		
		
		return dao.updateemployee(empid, emp);
	}

	@Override
	public Emplooyee getemployee(int empid) {
		// TODO Auto-generated method stub
		
		return dao.getemployee(empid);
	}

	@Override
	public String deleteemployee(int empid) {
		// TODO Auto-generated method stub
		
		return dao.deleteemployee(empid);
	}

	@Override
	public Set<Entry<Integer, Emplooyee>> getallemployee() {
		// TODO Auto-generated method stub
		
		return dao.getallemployee();
	}

}
