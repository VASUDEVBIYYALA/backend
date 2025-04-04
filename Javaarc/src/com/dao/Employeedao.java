package com.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.model.Emplooyee;

public class Employeedao implements Employeedaoinf {

	HashMap<Integer,Emplooyee> hasmap = new HashMap<Integer,Emplooyee>();
	int empid = 200;
	@Override
	public int addemployee(Emplooyee emp) {
		
		hasmap.put(++empid, emp);
		return empid;
	}

	@Override
	public Emplooyee updateemployee(int empid, Emplooyee emp) {
		Emplooyee empobj=hasmap.put(empid, emp);
		return empobj;
	}

	@Override
	public Emplooyee getemployee(int empid) {
		Emplooyee get=hasmap.get(empid);
		return get;
	}

	@Override
	public String deleteemployee(int empid) {
		// TODO Auto-generated method stub
		Emplooyee rem= hasmap.remove(empid);
		return "employee del sucesfully"+empid;
	}

	@Override
	public Set<Entry<Integer, Emplooyee>> getallemployee() {
		// TODO Auto-generated method stub
		Set <Entry <Integer, Emplooyee>> itr=hasmap.entrySet();
		//Iterator <Entry <Integer, Emplooyee>> res=itr.iterator();
		return itr;
	}

}
