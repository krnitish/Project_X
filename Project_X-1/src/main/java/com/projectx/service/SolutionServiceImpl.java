package com.projectx.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.projectx.dao.SolutionDao;

public class SolutionServiceImpl implements SolutionService{

	@Autowired
	SolutionDao solutionDao;
}
