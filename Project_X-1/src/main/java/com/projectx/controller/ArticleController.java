package com.projectx.controller;

import java.io.File;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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
	
	@Autowired
	Environment env;

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
			for(String str: article.getArticleSolution())
			{
				if(str.length()>200)
				{
					str.substring(0, 200);
				}
			}
//			if(article.getArticleSolution()..length()>200)
//			{
//				article.setArticleSolution(article.getArticleSolution().substring(0, 200)+"...");
//			}
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
	@GetMapping("/startsolr")
	public String runCommandLine() {
		
		try {
			Runtime rt = Runtime.getRuntime();
			String solrpath=env.getProperty("solrpath");
			rt.exec("cmd.exe /c start solr start", null, new File(solrpath));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "command line opened";
	}

}
