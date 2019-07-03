package com.projectx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectx.dao.TitleDao;
import com.projectx.entity.Title;

@Service
public class TitleServiceImpl implements TitleService {

	@Autowired
	TitleDao titleDao;

	@Override
	public Title addTitle(Title title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Title> showTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	
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
