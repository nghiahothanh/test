package com.KMA.sony.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.KMA.sony.entity.newsEntity;
import com.KMA.sony.entity.usersEntity;

@Repository
public interface userRepo extends JpaRepository<usersEntity, Long> {

	
//	@Query("INSERT INTO users VALUES (1, 'Ho Thanh Nghia', '20/03/2003', '20/11/2023', 'Ho Thi Xuan Huong', 'Ho Thanh Phong', 'Htn@1258', 1, 'whoami', 'nghia319')")
//	usersEntity inertUser();
			
}

