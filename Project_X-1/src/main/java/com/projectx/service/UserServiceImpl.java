package com.projectx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.projectx.dao.UserDao;
import com.projectx.encrypt.AES;
import com.projectx.entity.Users;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;
	
	@Autowired
	AES aes;
	
	@Override
	public Users checkLogin(String userid, String password) {
		if(dao.isExist(userid))
		{
			Users user=dao.findById(userid);
			String encryptedPwd = user.getPassword();
			if(aes.decrypt(encryptedPwd).equals(password)) {
				user.setPassword("-------------");
				return user;
			}
			return null;
		}
		return null;
	}

	@Override
	public String deleteUser(String userid) {
		if(dao.isExist(userid))
		{
			return dao.deleteUser(userid);
		}
		return "user doesn't exist";
	}

	@Override
	public String createUser(Users user) {
		
		if(dao.isExist(user.getUserid()))
		{
			return "user already exist";
		}
		else {
			user.setPassword(aes.encrypt(user.getPassword()));
			dao.saveUser(user);
			return "user created";
		}
		
	}

	@Override
	public String modifyUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

}
