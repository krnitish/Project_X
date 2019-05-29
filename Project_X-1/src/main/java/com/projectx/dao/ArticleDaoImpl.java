package com.projectx.dao;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projectx.encrypt.AES;
import com.projectx.entity.Article;
import com.projectx.entity.Users;
import com.projectx.repository.AppRepository;

@Repository
@Transactional
public class ArticleDaoImpl implements ArticleDao{

	@Autowired
	AppRepository repo;
	
	@Autowired
	Environment env;
//	
//	@Override
//	public String populateArticle(Article article) {
//		System.out.println("test pass");
//		String sorlUrlString="http://localhost:8983/solr/test";
//		SolrClient client=new HttpSolrClient.Builder(sorlUrlString).build();
//		
//		SolrInputDocument doc = new SolrInputDocument();
//		 doc.addField(article.getAtricleTitle(),article.getArticleSolution());
//		 
//		 try {
//			 client.add(doc);
//			client.commit();
//		} catch (SolrServerException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return "Article added";
//		
//	}
//
//	@Override
//	public void searchArticle(int id) {
//		String sorlUrlString="http://localhost:8983/solr/test";
//		SolrClient client=new HttpSolrClient.Builder(sorlUrlString).build();
//		
//		SolrQuery query = new SolrQuery();
//        query.setQuery("*:*");
//       // query.
//      //  query.addFilterQuery("id:book-0");
////        query.setFields("id","price","merchant","cat","store");
//        query.setStart(0);
//        query.set("defType", "edismax");
//
//        QueryResponse response;
//		try {
//			response = client.query(query);
//			 SolrDocumentList results = response.getResults();
//			  System.out.println(results.get(0));
//		} catch (SolrServerException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
	//@Query(value = "select fname, lname, email, role from Users where userid=? and password= ?", nativeQuery = true)
	@Override
	public Users checkLogin(String userid, String password) {
		System.out.println("User id : "+ userid+ "\nPassword : "+password);
		
		if(repo.existsById(userid))
		{
			Users user=repo.getOne(userid);
			String encryptedPwd=user.getPassword();
			System.out.println("Encrypted: "+encryptedPwd);
			String decryptedPwd=AES.decrypt(encryptedPwd, env.getProperty("secretkey"));
			System.out.println("Decrypted: "+decryptedPwd);
			if(decryptedPwd.equals(password))
			{
				return user;
			}else {
				return null;
			}
			
		}
		else {
			return null;
		}
			
	}
}
