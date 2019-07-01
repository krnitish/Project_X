package com.projectx.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection="Article")
public class Article {

	
	//@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Id
	@Indexed(name = "aid", type = "int")
	private int atricleId;
	@Indexed(name = "articleTitle", type = "string")
	private String atricleTitle;
	@Indexed(name = "aSolution", type = "string")
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
