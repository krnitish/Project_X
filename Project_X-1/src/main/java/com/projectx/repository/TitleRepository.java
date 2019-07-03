package com.projectx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectx.entity.Title;

public interface TitleRepository extends JpaRepository<Title, String>{

}
