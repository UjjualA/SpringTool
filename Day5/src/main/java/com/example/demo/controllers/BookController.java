package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Book;
import com.example.demo.Service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService Bookserv;
	@PostMapping("/add")
	public Book addBook(@RequestBody Book obj)
	{
		return Bookserv.addBook(obj);
	}
	@GetMapping("/show")
	public List<Book>getBook()
	{
		List<Book>arr=new ArrayList<>();
		arr=Bookserv.getAllBook();
		return arr;
	}
	@DeleteMapping("/Delete/{Price}")
	public void delete(@PathVariable int Price)
	{
		Bookserv.delete(Price);
	}
	@PutMapping("/update/{Price}")
	public Book update(@PathVariable int Price,@RequestBody Book obj)
	{
		return Bookserv.update(Price,obj);
	}
	
	
}
