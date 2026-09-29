package com.itvedant.users.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.itvedant.users.entities.User;
import com.itvedant.users.reposatories.UserJpa;

@Service
public class UserService {

	@Autowired
	UserJpa jpa;

	public User add(User user) {
		return jpa.save(user);
	}

	public User read(Integer id) {
		return jpa.findById(id).orElse(null);
	}

	public List<User> readAll() {
		return jpa.findAll();
	}

	public boolean login(String name, String password) {
		return jpa.findByNameAndPassword(name, password) != null;
	}

	public boolean signIn(String name, String password) {
		List<User> users = jpa.findAll();

		for (int i = 0; i < users.size(); i++) {
			if (name.equals(users.get(i).getName()) && password.equals(users.get(i).getPassword())) {
				return true;
			}
		}

		return false;
		
	}	
		
		public Page<User> getUserByPages(int pageNum,int size){
			return jpa.findAll(PageRequest.of(pageNum, size));
			
	

	}

}
