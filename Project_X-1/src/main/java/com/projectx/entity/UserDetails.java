package com.projectx.entity;

public class UserDetails {

	private String userid;
	private String fname;
	private String lname;
	private String DU;
	private String email;
	
	public UserDetails() {
		// TODO Auto-generated constructor stub
	}

	public UserDetails(String fname, String lname, String dU, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		DU = dU;
		this.email = email;
	}
	

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDU() {
		return DU;
	}

	public void setDU(String dU) {
		DU = dU;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDetails [fname=" + fname + ", lname=" + lname + ", DU=" + DU + ", email=" + email + "]";
	}
	
}
