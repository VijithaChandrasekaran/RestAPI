package com.example.dataJPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dataJPA.Entity.Student;
import com.example.dataJPA.Repository.ContactRepo;
import com.example.dataJPA.Repository.StudentRepo;
import com.example.dataJPA.request.StudentRequest;

import lombok.Data;

@Data
@RestController
public class StudentController {
	
	@Autowired
	private StudentRepo studentRepo;
	
	private ContactRepo contactRepo;
	
	@PostMapping("/post")
	public Student sendDetail(@RequestBody StudentRequest request) {
		return(studentRepo.save(request.getStudent()));
	}
	
	@GetMapping("/get")
	public List<Student> findAllContacts(){
		return studentRepo.findAll();
	}
}
