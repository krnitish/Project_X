package com.projectx.dao;

import com.projectx.entity.Title;

public interface TitleDao {

	public Title saveTitle(Title title);
	
	public Title getTitle(String titleId);
	
	public String deleteTitle(String titleId);	
	
}
