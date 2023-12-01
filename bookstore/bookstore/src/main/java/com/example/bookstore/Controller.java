package com.example.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class Controller {
	
	@Autowired
	bookrepository b1;
	
	@PostMapping("/booksave")
	public String insert (@RequestBody book b11 )
	{
		bookrepository.save(b11);
		return "your record is saved";
		}
	}
	
	
	
	

}
