package com.projectx.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@Entity
@Table(name = "userinfo")
public class Users{

	@Id
	private String userid;
	@NotEmpty
	private String password;
	@NotEmpty
	private String role;
	@NotEmpty
	private String firstname;
	private String lastname;
	@Email
	private String email;
	private String field_x;
	
	
	public Users() {
		// TODO Auto-generated constructor stub
	}


	public Users(String userid, @NotEmpty String password, @NotEmpty String role, @NotEmpty String firstname,
			String lastname, @Email String email, String field_x) {
		super();
		this.userid = userid;
		this.password = password;
		this.role = role;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
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


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getField_x() {
		return field_x;
	}


	public void setField_x(String field_x) {
		this.field_x = field_x;
	}


	@Override
	public String toString() {
		return "Users [userid=" + userid + ", password=" + password + ", role=" + role + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", email=" + email + ", field_x=" + field_x + "]";
	}
	
}