package com.projectx.dao;

import com.projectx.entity.Article;

public interface ArticleDao {

	public String populateArticle(Article article);
	
	public void searchArticle(int id);
	
	public String checkLogin(String id,String pwd);
}
