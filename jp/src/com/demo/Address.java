package com.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="oto_add")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int houseno;
	private String colonyname;
	private String state;
	private int pincode;
	private void gethouseno() {
		
	}
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getColonyname() {
		return colonyname;
	}
	public void setColonyname(String colonyname) {
		this.colonyname = colonyname;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", colonyname=" + colonyname + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	public Address(int houseno, String colonyname, String state, int pincode) {
		super();
		this.houseno = houseno;
		this.colonyname = colonyname;
		this.state = state;
		this.pincode = pincode;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	

}
