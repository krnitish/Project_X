package com.projectx.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.validation.annotation.Validated;

@Validated
@Entity
public class Users {

	@Id
	private String username;
	@NotEmpty
	private String pwd;
	@NotEmpty
	private String fname;
	@NotEmpty
	private String lname;
	private String role;
	
	
	public Users() {
		// TODO Auto-generated constructor stub
	}


	public Users(String username, String pwd, String fname, String lname, String role) {
		super();
		this.username = username;
		this.pwd = pwd;
		this.fname = fname;
		this.lname = lname;
		this.role = role;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
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


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Users [username=" + username + ", pwd=" + pwd + ", fname=" + fname + ", lname=" + lname + ", role="
				+ role + "]";
	}
	
	
}