package com.itvedant.mappings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itvedant.mappings.Reposatory.UserReposatory;
import com.itvedant.mappings.entity.User1;

@Service
public class UserService {

	@Autowired
	private UserReposatory userReposatory;
	
	public User1 createUser(User1 user) {
		return userReposatory.save(user);
	}
	
	public User1 getUser(long id) {
		return userReposatory.findById(id).orElseThrow();
	}
}
