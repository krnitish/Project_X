package com.projectx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.projectx.dao.ArticleDao;
import com.projectx.entity.Article;
import com.projectx.entity.Users;

public interface ArticleService {

	
//	public String addAtricle(Article article);
//	
//	public void showArticle(int id);
//	
//	public void deleteArticle(int id);
//	
//	public void showAllArticle();
//	
//	public void modifyArticle(int id);
//	
	public Users checkLogin(String id, String pwd);
}
