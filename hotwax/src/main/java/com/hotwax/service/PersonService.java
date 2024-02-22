package com.hotwax.service;

import java.util.List;

import com.hotwax.payloads.PersonDto;

public interface PersonService {

	PersonDto createPerson(PersonDto personDto);
	
	PersonDto updatePerson(PersonDto personDto, Long personId);
	
	void deletePerson(Long personId);
	
	PersonDto getPersonById(Long personId);
	
	List<PersonDto> getAllPersons();
	
}
