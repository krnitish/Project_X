package com.projectx.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Title {

	@Id
	private String titleId;
	@NotEmpty
	private String userid;
	@NotEmpty
	private String title;
	@OneToMany(mappedBy = "title")
	private List<Solution> solutionList;
	
	public Title() {
		// TODO Auto-generated constructor stub
	}

	public Title(String titleId, @NotEmpty String userid, @NotEmpty String title, List<Solution> solutionList) {
		super();
		this.titleId = titleId;
		this.userid = userid;
		this.title = title;
		this.solutionList = solutionList;
	}

	public String getTitleId() {
		return titleId;
	}

	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Solution> getSolutionList() {
		return solutionList;
	}

	public void setSolutionList(List<Solution> solutionList) {
		this.solutionList = solutionList;
	}

	@Override
	public String toString() {
		return "Title [titleId=" + titleId + ", userid=" + userid + ", title=" + title + ", solutionList="
				+ solutionList + "]";
	}
}