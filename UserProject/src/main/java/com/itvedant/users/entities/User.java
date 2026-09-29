package com.itvedant.users.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	int uid;
	String name;
	String password;
	double salary;

	public User(int uid, String name, String password, double salary) {
		this.uid = uid;
		this.name = name;
		this.password = password;
		this.salary = salary;
	}

	User() {

	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
