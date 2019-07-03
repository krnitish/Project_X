package com.projectx.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.projectx.entity.Solution;
import com.projectx.repository.SolutionRepository;

public class SolutionDaoImpl implements SolutionDao{

	@Autowired
	SolutionRepository s;

	@Override
	public Solution saveSolution(Solution solution) {
		return s.save(solution);
	}

	@Override
	public Solution getSolution(String solutionId) {
		return s.getOne(solutionId);
	}

	@Override
	public String deleteSolution(String solutionId) {
		s.deleteById(solutionId);
		return "deleted";
	}
}
