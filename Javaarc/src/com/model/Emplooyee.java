package com.model;

public class Emplooyee {
	
	private String empname;
	private int empsal;
	private String empmail;
	private String empadd;
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
	public String getEmpmail() {
		return empmail;
	}
	public void setEmpmail(String empmail) {
		this.empmail = empmail;
	}
	public String getEmpadd() {
		return empadd;
	}
	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}
	@Override
	public String toString() {
		return "Emplooyee [empname=" + empname + ", empsal=" + empsal + ", empmail=" + empmail + ", empadd=" + empadd
				+ "]";
	}
	
	public Emplooyee() {
		// TODO Auto-generated constructor stub
	}
	public Emplooyee(String empname, int empsal, String empmail, String empadd) {
		super();
		this.empname = empname;
		this.empsal = empsal;
		this.empmail = empmail;
		this.empadd = empadd;
	}
	

}
