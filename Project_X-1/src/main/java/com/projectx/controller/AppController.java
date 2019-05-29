package com.projectx.controller;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projectx.entity.Article;
import com.projectx.entity.HttpStatusMessage;
import com.projectx.entity.LoginInfo;
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
	
	@CrossOrigin
	@RequestMapping("/")
	public String  greet()
	{
		System.out.println("greet");
		return "Welcome";
	}
	@CrossOrigin
	@PostMapping("/createuser")
	public String createUser(@RequestBody Users user)
	{
		System.out.println("before checking");
			if(repo.existsById(user.getUserid()))
			{
				System.out.println("in if condition");
				
				return "user already exists";
			}
		repo.save(user);
		return "user created";
	}
	@PostMapping("/login")
	@CrossOrigin
	public ResponseEntity<Object> loginCheck(@RequestBody LoginInfo info)
	{
		System.out.println("username: "+info.getUserid()+" Password: "+info.getPassword());
		Users user=service.checkLogin(info.getUserid(), info.getPassword());
		
		System.out.println("I am in controller:");
		if (user==null)
		{
			HttpStatusMessage msg=new HttpStatusMessage();

			msg.setStatusText("username or password invalid");

			return new ResponseEntity<Object>(msg, HttpStatus.UNAUTHORIZED);
		}
		user.setPassword("********");
		return new ResponseEntity<Object>(user, HttpStatus.OK);
	}
	@CrossOrigin
	@GetMapping("/getAllUsers")
	public List<Users> findAllUsers()
	{
		return repo.findAll();
	}
//	
//	@PostMapping("/save")
//	public String saveArticle(@RequestBody Article article)
//	{
//		System.out.println("test 0");
//		return service.addAtricle(article);
//	}
//	
//	@GetMapping("/get/{key}")
//	public Article getArticle(@RequestParam String key)
//	{
//		return null;
//	}
//	@Autowired
//	private Environment env;
//	
//	@GetMapping("/checkPro")
//	public String checkProperty()
//	{
//		String name=env.getProperty("name");
//		return name;
//	}
}
