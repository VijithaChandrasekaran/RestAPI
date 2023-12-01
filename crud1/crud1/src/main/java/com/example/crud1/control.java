package com.example.crud1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;


@Service
public class control {
	
	@Autowired
	BooksRepository b1;
	@RequestMapping("/books")
	public List<books> getAllBooks()   
	{  
	List<books> books = new ArrayList<books>();  
	b1.findAll().forEach(books1 -> books.add(books1));  
	return books;  
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public books getBooksById(int id)   
	{  
	return b1.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(books books)   
	{  
	b1.save(books);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
	b1.deleteById(id);  
	}  
	//updating a record  
	public void update(books books, int bookid)   
	{  
	b1.save(books);  
	}  
	}  


