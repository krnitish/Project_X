package com.projectx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.projectx.entity.Users;

public interface AppRepository extends JpaRepository<Users, String> {

}
