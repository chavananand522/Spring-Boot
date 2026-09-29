package com.itvedant.Books;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
		System.out.println("Hare Krishna...");
		
	}

}
