package com.example.dataJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dataJPA.Entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

}
