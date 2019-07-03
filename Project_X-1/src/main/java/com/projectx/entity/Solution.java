package com.projectx.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Solution {
	
	@Id
	private String solutionId;
	@ManyToOne
	@JoinColumn(name="titleId")
	private Title title;
	private String userId;
	private String solution;
	private String upvote;
	
	
	public Solution() {
		// TODO Auto-generated constructor stub
	}


	public Solution(String solutionId, Title title, String userId, String solution, String upvote) {
		super();
		this.solutionId = solutionId;
		this.title = title;
		this.userId = userId;
		this.solution = solution;
		this.upvote = upvote;
	}


	public String getSolutionId() {
		return solutionId;
	}


	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}


	public Title getTitle() {
		return title;
	}


	public void setTitle(Title title) {
		this.title = title;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getSolution() {
		return solution;
	}


	public void setSolution(String solution) {
		this.solution = solution;
	}


	public String getUpvote() {
		return upvote;
	}


	public void setUpvote(String upvote) {
		this.upvote = upvote;
	}
	
	
}