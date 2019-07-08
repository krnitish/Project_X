package com.projectx.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectx.dao.ArticleDao;
import com.projectx.entity.Article;
import com.projectx.entity.Users;
import com.projectx.repository.ArticleRepository;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleDao dao;
	
	@Override
	public Article addAtricle(Article article) {
		dao.saveUser(article);
		return article;
	}
	
	public Iterable<Article> getAll() {
		return dao.findAll();
		}

	@Override
	public Optional<Article> getById(int id) {
		
		return dao.getById(id);
	}

	@Override
	public String deleteArticle(Integer id) {
		dao.deleteById(id);
		return "deleted";
	}

	@Override
	public String deleteAll() {
		
		return dao.deleteAll();
	}
	
	@Override
	public List<Article> searchArticleByKeyword(String keyword)
	{
		List<Article> result=new ArrayList<Article>();
		Iterable<Article> list=dao.findAll();
		
		for (Article article : list) {
			if(article.getArticleTitle().toLowerCase().contains(keyword.toLowerCase()))
			{
				result.add(article);
				continue;
			}
			List<String> solutionList=article.getArticleSolution();
			for (String solution : solutionList) {
				if(solution.toLowerCase().contains(keyword.toLowerCase()))
				{
					result.add(article);
				}
			}
		}
		return result;
	}

//	@Autowired
//	ArticleDao dao;
//	
	
//	@Override
//	public String addAtricle(Article article) {
//		System.out.println("test1");
//		return dao.populateArticle(article);
//		
//	}
//
//	@Override
//	public void showArticle(int id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteArticle(int id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void showAllArticle() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void modifyArticle(int id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public Users checkLogin(String id, String pwd) {
//		
//		return dao.checkLogin(id, pwd);
	

}
