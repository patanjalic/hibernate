package com.patanjali.domain;

public class Movie {
	private int id=0;
	private String title=null;
	private String synopsys=null;
	private String director=null;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSynopsys() {
		return synopsys;
	}
	public void setSynopsys(String synopsys) {
		this.synopsys = synopsys;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}	
}
