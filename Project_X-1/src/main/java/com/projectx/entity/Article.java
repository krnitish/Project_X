package com.projectx.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Article {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int atricleId;
	@NotEmpty
	private String atricleTitle;
	private String articleSolution;
	
	public Article() {
		// TODO Auto-generated constructor stub
	}

	public Article(int atricleId, String atricleTitle, String articleSolution) {
		super();
		this.atricleId = atricleId;
		this.atricleTitle = atricleTitle;
		this.articleSolution = articleSolution;
	}

	public int getAtricleId() {
		return atricleId;
	}

	public void setAtricleId(int atricleId) {
		this.atricleId = atricleId;
	}

	public String getAtricleTitle() {
		return atricleTitle;
	}

	public void setAtricleTitle(String atricleTitle) {
		this.atricleTitle = atricleTitle;
	}

	public String getArticleSolution() {
		return articleSolution;
	}

	public void setArticleSolution(String articleSolution) {
		this.articleSolution = articleSolution;
	}

	@Override
	public String toString() {
		return "Article [atricleId=" + atricleId + ", atricleTitle=" + atricleTitle + ", articleSolution="
				+ articleSolution + "]";
	}
	
}
