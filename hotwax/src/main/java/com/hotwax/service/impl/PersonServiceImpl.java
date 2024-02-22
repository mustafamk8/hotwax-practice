package com.hotwax.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotwax.entity.Person;
import com.hotwax.exception.ResourceNotFoundException;
import com.hotwax.payloads.PersonDto;
import com.hotwax.repository.PersonRepo;
import com.hotwax.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepo personRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public PersonDto createPerson(PersonDto personDto) {
		// TODO Auto-generated method stub
		
		Person person = this.dtoToPerson(personDto);
		Person savedPerson = this.personRepo.save(person);
		return this.personToDto(savedPerson);
	}

	@Override
	public PersonDto updatePerson(PersonDto personDto, Long personId) {
		// TODO Auto-generated method stub
		Person person = this.personRepo.findById(personId).orElseThrow(()->new ResourceNotFoundException("Person", "Id", personId));
		person.setFirstName(personDto.getFirstName());
		person.setLastName(personDto.getLastName());
		person.setMiddleName(personDto.getMiddleName());
		person.setSalutation(personDto.getMiddleName());
		person.setGender(personDto.getGender());
		person.setBirthDate(personDto.getBirthDate());
		person.setMaritalStatusEnumId(personDto.getMaritalStatusEnumId());
		person.setEmploymentStatusEnumId(personDto.getEmploymentStatusEnumId());
		person.setOccupation(personDto.getOccupation());
		
		Person updatedPerson = this.personRepo.save(person);
		PersonDto updatedPersonDto = this.personToDto(updatedPerson);
		
		return updatedPersonDto;
	}

	@Override
	public void deletePerson(Long personId) {
		// TODO Auto-generated method stub
		Person person = this.personRepo.findById(personId).orElseThrow(()->new ResourceNotFoundException("Person", "Id", personId));
		this.personRepo.delete(person);
		
	}

	@Override
	public PersonDto getPersonById(Long personId) {
		// TODO Auto-generated method stub
		Person person = this.personRepo.findById(personId).orElseThrow(()->new ResourceNotFoundException("Person", "Id", personId));
		
		return this.personToDto(person);
	}

	@Override
	public List<PersonDto> getAllPersons() {
		// TODO Auto-generated method stub
		
		List<Person> personList = this.personRepo.findAll();
		List<PersonDto> personDtos = personList.stream().map(p->this.personToDto(p)).collect(Collectors.toList());
		
		return personDtos;
	}
	
	public Person dtoToPerson(PersonDto personDto) {

		Person person = this.modelMapper.map(personDto, Person.class);
		return person;
	}

	public PersonDto personToDto(Person person) {

		PersonDto personDto = this.modelMapper.map(person, PersonDto.class);
		return personDto;

	}
	
	
}
