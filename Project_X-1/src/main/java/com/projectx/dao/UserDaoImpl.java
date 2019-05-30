package com.projectx.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projectx.entity.Users;
import com.projectx.repository.UserRepository;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	UserRepository repo;
	
	@Override
	public Users findById(String userid) {
		return repo.getOne(userid);
	}

	@Override
	public String deleteUser(String userid) {
		repo.deleteById(userid);
		return userid+" deleted";
	}

	@Override
	public boolean validateUser(String userid, String password) {
		if(repo.getOne(userid).getPassword().equals(password))
		{
			return true;
		}
		return false;
	}

	@Override
	public Users saveUser(Users user) {
		return repo.save(user);
	}

	@Override
	public List<Users> findAllUsers() {
		return repo.findAll();
	}

	@Override
	public boolean isExist(String userid) {
		return repo.existsById(userid);
	}

	
	
}
