package com.projectx.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectx.entity.Article;
import com.projectx.service.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	ArticleService service;

	@CrossOrigin
	@PostMapping("/save")
	public Article saveArticle(@RequestBody Article article) {
		return service.addAtricle(article);
	}

	@CrossOrigin
	@GetMapping("/getAll")
	public Iterable<Article> getAllArticle() {
		Iterable<Article> list =  service.getAll();
		//List<Article> alist=(List<Article>) service.getAll();
		for (Article article : list) {
			if(article.getArticleSolution().length()>200)
			{
				article.setArticleSolution(article.getArticleSolution().substring(0, 200)+"...");
			}
		}
		
		
	return list;
	}

	@CrossOrigin
	@GetMapping("/getById/{id}")
	public Optional<Article> getArticleById(@PathVariable("id") int id) {
		return service.getById(id);
	}
	
	@CrossOrigin
	@DeleteMapping("/delete/{id}")
	public String deleteArticle(@PathVariable("id") int id)
	{
		Integer id1=id;
		return service.deleteArticle(id1);
	}

	@CrossOrigin
	@GetMapping("/runcmd")
	public String runCommandLine() {
		try {
			// Just one line and you are done !
			// We have given a command to start cmd
			// /K : Carries out command specified by string
			Runtime.getRuntime().exec(new String[] { "cmd", "/K", "Start" });

		} catch (Exception e) {
			System.out.println("HEY Buddy ! U r Doing Something Wrong ");
			e.printStackTrace();
		}
		return "command line opened";
	}

}
