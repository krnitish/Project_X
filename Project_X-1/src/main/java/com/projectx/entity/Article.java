package com.projectx.entity;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;


@SolrDocument(collection="article")
public class Article {

	
	//@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Id
	@Indexed(name = "id", type = "int")
	private int articleId;
	@Indexed(name = "articleTitle", type = "string")
	private String articleTitle;
	@Indexed(name = "aSolution", type = "string")
	private String articleSolution ;
	
	
	public Article() {
		// TODO Auto-generated constructor stub
	}

	public Article(int articleId, String articleTitle, String articleSolution) {
		super();
		this.articleId = articleId;
		this.articleTitle = articleTitle;
		this.articleSolution = articleSolution;
	
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getArticleSolution() {
		return articleSolution;
	}

	public void setArticleSolution(String articleSolution) {
		this.articleSolution = articleSolution;
	}

	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", articleTitle=" + articleTitle + ", articleSolution="
				+ articleSolution + "]";
	}
	
	
}
