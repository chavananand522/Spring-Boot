package com.itvedant.Books;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// DML
@Repository
public interface BookJpa extends JpaRepository <Book,Integer>{
/*	These are some of the methods inside JpaReposatory 
	save()method 	-> To add the data 
	findById(id)	-> To read the data by using its id
	deleteById(id) 	-> To delete the data by using its id
	*/
}
