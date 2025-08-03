package com.library.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.user.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{
	
	boolean existsByRollNo(String rollNo);
	UserEntity findByRollNo(String rollNo);
}
