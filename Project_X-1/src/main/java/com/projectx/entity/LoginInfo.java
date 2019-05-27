package com.projectx.entity;

public class LoginInfo {

	private String userid;
	private String password;
	
	public LoginInfo() {
		// TODO Auto-generated constructor stub
	}

	public LoginInfo(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
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

	@Override
	public String toString() {
		return "LoginInfo [userid=" + userid + ", password=" + password + "]";
	}
		
}
