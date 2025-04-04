package com.controler;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.model.Emplooyee;
import com.service.Employeeservice;
import com.service.Employeeserviceinf;

public class Client {
	
	public static void main(String[] args) {
		
		Employeeserviceinf ser = new Employeeservice();
		
		while (true) {
			System.out.println("Employee MANAGEMENT aPLICATION");
			System.out.println("1.Add Employee");
			System.out.println("2.update Employee");
			System.out.println("3.get Employee");
			System.out.println("4.delete Employee");
			System.out.println("5.get all Employee");

			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter Employee name");
				String name = sc.next();
				System.out.println("Enter Employee salary");
				int salary = sc.nextInt();
				System.out.println("Enter Employee address");
				String add = sc.next();
				System.out.println("Emter Employee mail id ");
				String mail = sc.next();

				Emplooyee emp = new Emplooyee(name, salary, add, mail);

				int empid = ser.addemployee(emp);
				System.out.println("employee inserted :" + empid);

				break;
			case 2:
				System.out.println("Enter EMployee id");
				int eid = sc.nextInt();
				System.out.println("Enter Employee name");
				String ename = sc.next();
				System.out.println("Enter Employee salary");
				int esalary = sc.nextInt();
				System.out.println("Enter Employee address");
				String eadd = sc.next();
				System.out.println("Emter Employee mail id ");
				String email = sc.next();

				Emplooyee emp1 = new Emplooyee(ename, esalary, eadd, email);

				Emplooyee emobj = ser.updateemployee(eid, emp1);
				System.out.println(emobj);
				break;
			case 3:
				System.out.println("enter Empoyee id");
				int eid2 = sc.nextInt();

				Emplooyee getEmp = ser.getemployee(eid2);
				System.out.println(getEmp);
				break;
			case 4:
				System.out.println("Employe id to dleete");
				int eid3 = sc.nextInt();

				String delemp = ser.deleteemployee(eid3);
				System.out.println(delemp);
				break;
			case 5:
				Set<Entry<Integer, Emplooyee>> result = ser.getallemployee();
				Iterator<Entry<Integer, Emplooyee>> itr = result.iterator();
				while (itr.hasNext()) {
					Entry<Integer, Emplooyee> finalResult = itr.next();
					System.out.println(finalResult.getKey() + " " + finalResult.getValue());
				}

				break;
			default:
				System.out.println("enter valid option");
				break;
			}
	}
	
	

}
}
