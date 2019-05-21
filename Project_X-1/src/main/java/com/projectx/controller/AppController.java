package com.projectx.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@PostMapping("/createuser")
	public String createUser(@RequestBody Users user)
	{
		System.out.println("Name: "+user.getFname());	
		System.out.println("Role: "+user.getRole());
		
			if(repo.existsById(user.getUsername()))
			{
				return "user already exists";
			}
		repo.save(user);
		return "user created";
	}
	@RequestMapping("/login/{id}/{pwd}")
	public Users loginCheck(@PathVariable String id, @PathVariable String pwd)
	{
		
		return null;//service.checkLogin(id, pwd);
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
	@Autowired
	private Environment env;
	
	@GetMapping("/checkPro")
	public String checkProperty()
	{
		String name=env.getProperty("name");
		return name;
	}
}
