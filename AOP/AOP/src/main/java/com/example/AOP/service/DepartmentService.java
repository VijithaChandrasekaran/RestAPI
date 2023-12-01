package com.example.AOP.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.AOP.Repository.DepartmentRepository;
import com.example.AOP.model.Department;

public class DepartmentService {
	@Autowired
    private DepartmentRepository departmentRepository;

    public Department save( Department department ){
        return departmentRepository.save(department);
    }

    @CustomAnnotation
    public Department findById(Integer id ){
        return departmentRepository.findById(id).orElse(null);
    }

}
