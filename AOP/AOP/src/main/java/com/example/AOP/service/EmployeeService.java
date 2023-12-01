package com.example.AOP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AOP.Repository.EmployeeRepository;
import com.example.AOP.model.Employee;

@Service
public class EmployeeService {
	@Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee findById( Integer id ){
        return employeeRepository.findById(id).orElseThrow();
    }

}
