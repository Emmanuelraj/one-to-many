package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.example.demo.dto.Person;
import com.example.demo.interfaces.PersonJpaRepository;

@Configuration
public class PersonService 
{
	
	@Autowired
	private PersonJpaRepository jpaRepository;

	public List<Person> getData() {
		// TODO Auto-generated method stub
		return this.jpaRepository.findAll();
	}

	public String saveData(Person person) {
		// TODO Auto-generated method stub
		 this.jpaRepository.save(person);
		 
		 return "record saved";
	}

}
