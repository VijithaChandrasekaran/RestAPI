package com.example.bookstore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="book2")
public class books {
	
	@Id
	@GeneratedValue(strategy= GenerationType: IDENTITY)
	
	private int id;
	private String title;
	public int getId() {
		return id;
	}
	public books(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
