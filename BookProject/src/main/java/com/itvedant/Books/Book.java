package com.itvedant.Books;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity


public class Book {
	@Id
	private Integer id;
	private String name;
	private String pass;
	private String writter;
	private Double price;

	Book() {

	}

	public Book(Integer id, String name, String pass, String writter, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.writter = writter;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getWritter() {
		return writter;
	}

	public void setWritter(String writter) {
		this.writter = writter;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
