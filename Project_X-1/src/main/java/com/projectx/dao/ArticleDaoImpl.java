package com.projectx.dao;

import java.io.IOException;
import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projectx.entity.Article;
import com.projectx.entity.Users;
import com.projectx.repository.AppRepository;

@Repository
@Transactional
public class ArticleDaoImpl implements ArticleDao{

	@Autowired
	AppRepository repo;
	
	@Override
	public String populateArticle(Article article) {
		System.out.println("test pass");
		String sorlUrlString="http://localhost:8983/solr/test";
		SolrClient client=new HttpSolrClient.Builder(sorlUrlString).build();
		
		SolrInputDocument doc = new SolrInputDocument();
		 doc.addField(article.getAtricleTitle(),article.getArticleSolution());
		 
		 try {
			 client.add(doc);
			client.commit();
		} catch (SolrServerException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Article added";
		
	}

	@Override
	public void searchArticle(int id) {
		String sorlUrlString="http://localhost:8983/solr/test";
		SolrClient client=new HttpSolrClient.Builder(sorlUrlString).build();
		
		SolrQuery query = new SolrQuery();
        query.setQuery("*:*");
       // query.
      //  query.addFilterQuery("id:book-0");
//        query.setFields("id","price","merchant","cat","store");
        query.setStart(0);
        query.set("defType", "edismax");

        QueryResponse response;
		try {
			response = client.query(query);
			 SolrDocumentList results = response.getResults();
			  System.out.println(results.get(0));
		} catch (SolrServerException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
      

	}

	@Override
	public String checkLogin(String id, String pwd) {
		if(repo.getOne(id).equals(pwd))
		{
			return "validUser";
		}else {
			return "invalidUser";
		}
	}

}
