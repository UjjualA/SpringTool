package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Book_Details")
public class Book {
	@Id
	private int Price;
	private String Name;
	private String Author;
	private Long Quantity;
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public Long getQuantity() {
		return Quantity;
	}
	public void setQuantity(Long quantity) {
		Quantity = quantity;
	}
	public Book(int price, String name, String author, Long quantity) {
		super();
		Price = price;
		Name = name;
		Author = author;
		Quantity = quantity;
	}
	public Book() {
		
	}
}
