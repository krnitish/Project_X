package com.projectx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectx.entity.Users;

public interface AppRepository extends JpaRepository<Users, String> {

	//public Users findOne(String userid);
}
