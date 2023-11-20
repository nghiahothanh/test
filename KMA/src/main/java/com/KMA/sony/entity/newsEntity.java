package com.KMA.sony.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "news")
public class newsEntity extends baseEntity{

	@Column
	private String title ;
	@Column
	private String thumnail;
	@Column
	private String shortDesription;
	@Column
	private String content;

	
	@ManyToOne(optional=false)
	@JoinColumn(name="category_id"  )
	private categoryEntity category;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumnail() {
		return thumnail;
	}

	public void setThumnail(String thumnail) {
		this.thumnail = thumnail;
	}

	public String getShortDesription() {
		return shortDesription;
	}

	public void setShortDesription(String shortDesription) {
		this.shortDesription = shortDesription;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

//	public String getCategory_id() {
//		return category_id;
//	}
//
//	public void setCategory_id(String category_id) {
//		this.category_id = category_id;
//	}
//	
	
}
