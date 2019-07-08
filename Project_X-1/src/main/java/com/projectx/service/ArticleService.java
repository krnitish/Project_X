package com.projectx.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectx.dao.ArticleDao;
import com.projectx.entity.Article;
import com.projectx.entity.Users;


public interface ArticleService {

	public Article addAtricle(Article article);
//	
	
	public Iterable<Article> getAll();
//	public void showArticle(int id);
//	
	public String deleteArticle(Integer id);
	
	public String deleteAll();
//	
//	public void showAllArticle();
//	
//	public void modifyArticle(int id);
//	
//	public Users checkLogin(String id, String pwd);

	public Optional<Article> getById(int id);
	
	public List<Article> searchArticleByKeyword(String keyword);
	
	
}



