package com.projectx.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import com.projectx.entity.Article;

@Repository
@Qualifier("art")
public interface ArticleRepository extends SolrCrudRepository <Article, Integer> {
	
	
	@Query(value = "*:*")
    List<Article> getArticles();
	
}


