package com.example.dataJPA.Entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
/*
import jakarta.persistence.GenerationType;*/
//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
@Entity
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long CId;
	
	private String CNumber;

	public String getCNumber() {
		return CNumber;
	}

	public void setCNumber(String cNumber) {
		CNumber = cNumber;
	}
	
	
}
