package com.projectx.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	private String empId;
	private String fname;
	private String lname;
	private String email;
	private String DU;
	private String BU;
	private String managerId;
	private String pwd;
	
	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(String empId, String fname, String lname, String email, String dU, String bU, String managerId,
			String pwd) {
		super();
		this.empId = empId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		DU = dU;
		BU = bU;
		this.managerId = managerId;
		this.pwd = pwd;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDU() {
		return DU;
	}

	public void setDU(String dU) {
		DU = dU;
	}

	public String getBU() {
		return BU;
	}

	public void setBU(String bU) {
		BU = bU;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Users [empId=" + empId + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", DU=" + DU
				+ ", BU=" + BU + ", managerId=" + managerId + ", pwd=" + pwd + "]";
	}

}