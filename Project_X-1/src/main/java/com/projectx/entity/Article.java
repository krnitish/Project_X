package com.projectx.entity;

<<<<<<< HEAD
import java.util.List;
=======
import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
>>>>>>> branch 'master' of https://github.com/krnitish/Project_X.git

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

<<<<<<< HEAD
@SolrDocument(collection="article1")
=======

@SolrDocument(collection="article")
>>>>>>> branch 'master' of https://github.com/krnitish/Project_X.git
public class Article {

	
	//@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Id
	@Indexed(name = "id", type = "int")
	private int articleId;
	@Indexed(name = "articleTitle", type = "string")
	private String articleTitle;
	@Indexed(name = "aSolution", type = "string")
<<<<<<< HEAD
	private List<String> articleSolution;
=======
	private String articleSolution ;
	
>>>>>>> branch 'master' of https://github.com/krnitish/Project_X.git
	
	public Article() {
		// TODO Auto-generated constructor stub
	}

	public Article(int articleId, String articleTitle, List<String> articleSolution) {
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

	public List<String> getArticleSolution() {
		return articleSolution;
	}

	public void setArticleSolution(List<String> articleSolution) {
		this.articleSolution = articleSolution;
	}

	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", articleTitle=" + articleTitle + ", articleSolution="
				+ articleSolution + "]";
	}
<<<<<<< HEAD
=======
	
>>>>>>> branch 'master' of https://github.com/krnitish/Project_X.git
	
}
