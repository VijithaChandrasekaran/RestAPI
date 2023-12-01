package com.example.crud1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class BooksService {
	@Autowired  
	BooksRepository booksRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<books> getAllBooks()   
	{  
	List<books> books = new ArrayList<books>();  
	booksRepository.findAll().forEach(books1 -> books.add(books1));  
	return books;  
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public books getBooksById(int id)   
	{  
	return booksRepository.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(books books)   
	{  
	booksRepository.save(books);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
	booksRepository.deleteById(id);  
	}  
	//updating a record  
	public void update(books books, int bookid)   
	{  
	booksRepository.save(books);  
	}  
}
