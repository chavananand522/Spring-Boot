package com.itvedant.mappings.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;		//Primary key
	private String city;
	private String state;
	
	@OneToOne(mappedBy="address")
	private User1 user;
		
}
