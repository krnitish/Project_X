package com.projectx.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.projectx.entity.Article;
import com.projectx.entity.Users;

public interface ArticleDao {

//	public String populateArticle(Article article);
//	
//	public void searchArticle(int id);
//	
	//@Query(value = "select fname, lname, email, role from Users where userid=? and password= ?", nativeQuery = true)

	public Article saveUser(Article article);
	
	public Iterable<Article> findAll();

	public Optional<Article> getById(int id);

	public String deleteById(Integer id);
	
	public String deleteAll();
}
