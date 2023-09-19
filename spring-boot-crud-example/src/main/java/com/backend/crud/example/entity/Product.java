package com.backend.crud.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




//This is an simple API based project where we can interact with postman by using RestController in controller package;
//Our database name is javaproject, we can see our tables in our working workbench(MySQL) 
//This project is important to learn the basics about STS, how we can add APIs in our applications.

//We have used three tools for this project such as STS, MySQL and Postman for API.
//At here, we don't introduce any web design or html file





@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PRODUCT_TBL")
public class Product {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int quantity;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	


}
