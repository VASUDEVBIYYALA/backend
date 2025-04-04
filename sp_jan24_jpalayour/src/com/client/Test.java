package com.client;

import com.model.Employee;
import com.service.EmployeeServices;

public class Test {
	public static void main(String[] args) {
		EmployeeServices ser = new EmployeeServices();
		
		Employee emp = new Employee(1,"vasu",4555,"hyd");
		Employee emp1 = new Employee(2,"sri ", 5555,"jp");
		
		//ser.addEmployee(emp);
		//ser.addEmployee(emp1);
		Employee re=ser.finEmloyeebyid(1);
		System.out.println(re);
		//ser.deleteEmployee(emp1);
		re.setEmpadd("rrdd");
	}

}
