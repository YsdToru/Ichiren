package com.example.demo.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.User;


public interface UserRepository extends CrudRepository<User, String> {

	@Query("select exists(select * from user where user_id = :id and user_pass = :pass)")
	boolean userExists(String id, String pass);

}
