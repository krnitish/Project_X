package com.projectx.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projectx.entity.Article;
import com.projectx.entity.Users;
import com.projectx.repository.AppRepository;
import com.projectx.service.ArticleService;

@RestController
public class AppController {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	AppRepository repo;
	
	@Autowired
	ArticleService service;
	
	@RequestMapping("/")
	public String  greet()
	{
		System.out.println("greet");
		return "Welcome";
	}
	
	@RequestMapping("/createuser/{id}/{pwd}")
	public String createUser(@PathVariable String id, @PathVariable String pwd)
	{
		System.out.println("User = "+id+", Pwd = "+pwd);
		Users user=new Users();
		user.setEmpId(id);
		user.setPwd(pwd);
		
		repo.save(user);
		return "user created";
	}
	@RequestMapping("/login/{id}/{pwd}")
	public String loginCheck(@PathVariable String id, @PathVariable String pwd)
	{
		
		return service.checkLogin(id, pwd);
	}
	
	@PostMapping("/save")
	public String saveArticle(@RequestBody Article article)
	{
		System.out.println("test 0");
		return service.addAtricle(article);
	}
	
	@GetMapping("/get/{key}")
	public Article getArticle(@RequestParam String key)
	{
		
		return null;
	}
}
