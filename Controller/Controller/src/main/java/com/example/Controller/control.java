package com.example.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class control {
	@RequestMapping("/hai")
	public List<employee> Emp()
	{
	return Arrays.asList(new employee(1,"vijitha"));
	
	}
}
