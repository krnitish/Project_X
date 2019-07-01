package com.projectx.controller;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectx.encrypt.AES;
import com.projectx.entity.Article;
import com.projectx.entity.HttpStatusMessage;
import com.projectx.entity.LoginInfo;
import com.projectx.entity.Users;
import com.projectx.repository.ArticleRepository;
import com.projectx.repository.UserRepository;
import com.projectx.service.ArticleService;
import com.projectx.service.UserService;

@RestController
public class AppController {

	@Autowired
	DataSource dataSource;

	@Autowired
	UserRepository repo;
	
	@Autowired
	UserService service;
	
	@Autowired
	ArticleService artservice;

	@Autowired
	Environment env;

	@CrossOrigin
	@RequestMapping("/")
	public String greet() {
		System.out.println("greet");
		return "Welcome";
	}

	@CrossOrigin
	@PostMapping("/user/register")
	public String createUser(@RequestBody Users user) {
		return service.createUser(user);
	}

	@PostMapping("/user/login")
	@CrossOrigin
	public ResponseEntity<Object> loginCheck(@RequestBody LoginInfo info) {
		System.out.println("username: " + info.getUserid() + " Password: " + info.getPassword());
		Users user = service.checkLogin(info.getUserid(), info.getPassword());

		if (user == null) {
			HttpStatusMessage msg = new HttpStatusMessage();

			msg.setStatusText("username or password invalid");

			return new ResponseEntity<Object>(msg, HttpStatus.UNAUTHORIZED);
		}
		user.setPassword("********");
		return new ResponseEntity<Object>(user, HttpStatus.OK);
	}

	@CrossOrigin
	@GetMapping("/user/all")
	public List<Users> findAllUsers() {
		return repo.findAll();
	}

//	
	@PostMapping("/saveArticle")
	public Article saveArticle(@RequestBody Article article)
	{		
		System.out.println("test 0");
		return artservice.addAtricle(article);
	}
	
@GetMapping("/getArticle")
	public Iterable<Article> getArticle()
	{
	return artservice.getAll();
			
	}
//	@Autowired
//	private Environment env;
//	
	@GetMapping("/checkPro")
	public String checkProperty() {
		String name = env.getProperty("name");
		return name;
	}
}
