/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.Person;
import com.example.demo.service.PersonService;

/**
 * @author user
 *
 */
@Controller
public class PersonController 
{
	
	
	
	
	@Autowired
	private PersonService personService;
	
	
	
    @GetMapping("/")
    public List<Person> getData()
    {
    	System.out.println("getData method");
    	
     return	this.personService.getData();
    }
    
    
    @PostMapping("/save")
    public String saveData(@RequestBody Person person)
    {
		System.out.println("saveData");
		
		return this.personService.saveData(person);
	}

}
