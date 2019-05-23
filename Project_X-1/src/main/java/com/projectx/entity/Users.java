package com.projectx.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@Entity
public class Users{

	@Id
	private String userid;
	@NotEmpty
	private String password;
	@NotEmpty
	private String role;
	private String field_x;
	
	
	public Users() {
		// TODO Auto-generated constructor stub
	}


	public Users(String userid, String password, String role, String field_x) {
		super();
		this.userid = userid;
		this.password = password;
		this.role = role;
		this.field_x = field_x;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getField_x() {
		return field_x;
	}


	public void setField_x(String field_x) {
		this.field_x = field_x;
	}


	@Override
	public String toString() {
		return "Users [userid=" + userid + ", password=" + password + ", role=" + role + ", field_x=" + field_x + "]";
	}
}