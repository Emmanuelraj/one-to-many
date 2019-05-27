/**
 * 
 */
package com.example.demo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Person;

/**
 * @author user
 *
 */
public interface PersonJpaRepository  extends JpaRepository<Person, Integer> 
{
              
}
