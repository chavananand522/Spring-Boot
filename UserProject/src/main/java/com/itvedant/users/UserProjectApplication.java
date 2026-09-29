package com.itvedant.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itvedant.users.services.B;

@SpringBootApplication
public class UserProjectApplication implements CommandLineRunner{

	@Autowired
	B b;
	public static void main(String[] args) {
		SpringApplication.run(UserProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		b.sun();
		
	}

}
