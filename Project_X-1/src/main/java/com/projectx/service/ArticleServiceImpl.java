package com.projectx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectx.dao.ArticleDao;
import com.projectx.entity.Article;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleDao dao;
	
	
	@Override
	public String addAtricle(Article article) {
		System.out.println("test1");
		return dao.populateArticle(article);
		
	}

	@Override
	public void showArticle(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteArticle(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAllArticle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyArticle(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String checkLogin(String id, String pwd) {
		return dao.checkLogin(id, pwd);
	}

}
