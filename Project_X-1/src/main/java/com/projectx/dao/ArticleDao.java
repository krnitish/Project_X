package com.projectx.dao;

import com.projectx.entity.Article;
import com.projectx.entity.Users;

public interface ArticleDao {

//	public String populateArticle(Article article);
//	
//	public void searchArticle(int id);
//	
	public Users checkLogin(String id,String pwd);
}
