package com.projectx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectx.entity.Solution;

public interface SolutionRepository extends JpaRepository<Solution, String>{

}
