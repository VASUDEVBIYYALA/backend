package com.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="oto_emp")
public class Employee {
	@Id
	private int empid;
	private String empname;
	private int empsal;
	@OneToOne(cascade =CascadeType.ALL)
	private Address address;

	private void getempid() {
		
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpsal() {
		return empsal;
	}

	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", address=" + address
				+ "]";
	}

	public Employee(int empid, String empname, int empsal, Address address) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.address = address;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
}
