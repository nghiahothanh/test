package com.KMA.sony.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class categoryEntity extends baseEntity{
 
	@Column
	private String name;
	@Column
	private String code;
	
	@OneToMany(mappedBy = "category")
	
	private List<newsEntity> newsList = new ArrayList<>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<newsEntity> getNews() {
		return newsList;
	}

	public void setNews(List<newsEntity> news) {
		this.newsList = news;
	}
	
	
}
