package com.hotwax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotwax.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Long>{

}
