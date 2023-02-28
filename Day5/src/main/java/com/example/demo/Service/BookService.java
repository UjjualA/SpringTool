package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Book;
import com.example.demo.repository.BookRepo;

@Service
public class BookService {
@Autowired
private BookRepo repo;
public Book addBook(Book obj)
{
	return repo.save(obj);
}
public List<Book>getAllBook()
{
	return repo.findAll();
}
public String delete(int Price)
{
	repo.deleteById(Price);
	return "deleted";
}
public List<Book>q()
{
	List<Book>c=repo.findAll();
	return c;
}
public Book update(int Price,Book obj)
{
	return repo.saveAndFlush(obj);
}
}
