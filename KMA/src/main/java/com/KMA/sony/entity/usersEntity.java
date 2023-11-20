package com.KMA.sony.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class usersEntity  extends baseEntity{

	@Column
	private String username;
	@Column
	private String password ;
	@Column
	private String fullname ;
	@Column
	private String status ;
	@Column
	private String role_id;
	
	 @ManyToMany
	 @JoinTable(name = "users_role",
		        joinColumns  = @JoinColumn (name ="user_id"),
		        inverseJoinColumns  = @JoinColumn (name ="role_id")
	 
		    )
		    private List<roleEntity> roles  = new ArrayList<>();
		 
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRole_id() {
		return role_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	public List<roleEntity> getRoles() {
		return roles;
	}
	public void setRoles(List<roleEntity> roles) {
		this.roles = roles;
	}
	
}
