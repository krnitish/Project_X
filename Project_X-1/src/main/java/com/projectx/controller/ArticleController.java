package com.projectx.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projectx.entity.Article;
import com.projectx.service.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	ArticleService service;
	
	@PostMapping("/save")
	public Article saveArticle(@RequestBody Article article)
	{
		return service.addAtricle(article);
	}
	
	@GetMapping("/getAll")
	public Iterable<Article> getAllArticle()
	{
		return service.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public Optional<Article> getArticleById(@PathVariable("id") int id)
	{
		return service.getById(id);
	}
	
	@GetMapping("/runcmd")
	public String runCommandLine()
	{
		  try
	        { 
	            // Just one line and you are done !  
	            // We have given a command to start cmd 
	            // /K : Carries out command specified by string 
	           Runtime.getRuntime().exec(new String[] {"cmd", "/K", "Start"}); 
	  
	        } 
	        catch (Exception e) 
	        { 
	            System.out.println("HEY Buddy ! U r Doing Something Wrong "); 
	            e.printStackTrace(); 
	        } 
	    return "command line opened";
	}
	
}
