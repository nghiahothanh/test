package com.KMA.sony.service;

import java.util.List;

import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.KMA.sony.entity.usersEntity;
import com.KMA.sony.repository.userRepo;

@Service
public class userService {

	@Autowired
	userRepo user1;
	
//	public void insertUser() {
//		user1.inertUser();
//	}
	public List<usersEntity> findUser() {
		return user1.findAll();
	}
}
