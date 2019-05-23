package com.projectx.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.projectx.entity.Users;
import com.projectx.repository.AppRepository;

public class UserDaoImpl implements UserDao{

	@Autowired
	AppRepository repo;
	
	public List<Users> findAll()
	{
		return repo.findAll();
	}
	
	public Users findById(String userid)
	{
		return repo.getOne(userid);
	}
	
	public String save(Users user)
	{
		if(repo.existsById(user.getUserid()))
		{
			return "Already exists";
		}
		else {
			repo.save(user);
			return "user created";
		}
	}
	
}
