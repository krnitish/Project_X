package com.projectx.dao;

import java.util.List;

import com.projectx.entity.Users;

public interface UserDao {
	
	public List<Users> findAllUsers();
	
	public Users findById(String userid);
	
	public String deleteUser(String userid);
	
	public boolean isExist(String userid);
	
	public boolean validateUser(String userid,String password);
	
	public Users saveUser(Users user);
	

}
