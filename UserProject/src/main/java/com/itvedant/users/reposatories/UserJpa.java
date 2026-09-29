package com.itvedant.users.reposatories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.itvedant.users.entities.User;

@Repository
public interface UserJpa extends JpaRepository<User, Integer> {

	
	 User findByNameAndPassword(String name, String password);
}

