package com.example.dataJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dataJPA.Entity.Contact;

public interface ContactRepo extends JpaRepository<Contact,Integer>{

}
