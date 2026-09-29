package com.itvedant.users.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Orders {
	@Id
	private int oid;
	private String productName;
	private double price;
	private Date date;
	public int getOid() {
		return oid;
	}
	
	Orders(){
		
	}
	
	public Orders(int oid, String productName, double price, Date date) {
		super();
		this.oid = oid;
		this.productName = productName;
		this.price = price;
		this.date = date;
	}



	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	} 
	
	
}
