package com.projectx.service;

import com.projectx.entity.Users;

public interface UserService {

	public Users checkLogin(String userid,String password);
	
	public String deleteUser(String userid);
	
	public String createUser(Users user);
	
	public String modifyUser(Users user);
	
}
