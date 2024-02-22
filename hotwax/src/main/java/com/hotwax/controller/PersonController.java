package com.hotwax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotwax.payloads.ApiResponse;
import com.hotwax.payloads.PersonDto;
import com.hotwax.service.PersonService;

@RestController
@RequestMapping("/hotwax")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@PostMapping("/")
	public ResponseEntity<PersonDto> createPerson(@RequestBody PersonDto personDto){
		PersonDto person = this.personService.createPerson(personDto);
		return new ResponseEntity<PersonDto>(person,HttpStatus.CREATED);
	}
	
	@PutMapping("/{personId}")
	public ResponseEntity<PersonDto> updatePerson(@RequestBody PersonDto personDto, @PathVariable("personId") Long personId){
		PersonDto updatedPerson = this.personService.updatePerson(personDto, personId);
		return ResponseEntity.ok(updatedPerson);
	}

	@GetMapping("/{personId}")
	public ResponseEntity<PersonDto> getPerson(@PathVariable("personId") Long personId){
		PersonDto person = this.personService.getPersonById(personId);
		return ResponseEntity.ok(person);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<PersonDto>> getAllPerson(){
		List<PersonDto> allPerson = this.personService.getAllPersons();
		return ResponseEntity.ok(allPerson);
	}
	
	@DeleteMapping("/{personId}")
	public ResponseEntity<ApiResponse> deletePerson(@PathVariable("personId") Long personId){
		this.personService.deletePerson(personId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Person deleted successfully",true),HttpStatus.OK);
	}
	
	
}
