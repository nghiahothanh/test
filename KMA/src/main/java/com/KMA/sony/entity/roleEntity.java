package com.KMA.sony.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class roleEntity extends baseEntity{

	@Column
	private String name ;
	@Column
	private String code;
	
	@ManyToMany(mappedBy = "roles")
	private List<usersEntity> users = new ArrayList<usersEntity>();
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
	
	
}
