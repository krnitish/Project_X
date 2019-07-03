package com.projectx.dao;

import com.projectx.entity.Solution;

public interface SolutionDao {

	public Solution saveSolution(Solution solution);
	
	public Solution getSolution(String solutionId);
	
	public String deleteSolution(String solutionId);
}
