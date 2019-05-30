package com.projectx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectx.entity.Users;

public interface UserRepository extends JpaRepository<Users, String> {
	
}
