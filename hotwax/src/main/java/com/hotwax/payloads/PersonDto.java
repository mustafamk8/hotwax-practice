package com.hotwax.payloads;

import java.time.LocalDate;

import com.hotwax.entity.Party;

import jakarta.persistence.Column;

public class PersonDto {

	private Long personId;

	private String salutation;

	private String firstName;

	private String middleName;

	private String lastName;

	private Party party;

	private Character gender;

	private LocalDate birthDate;

	private String maritalStatusEnumId;

	private String employmentStatusEnumId;

	private String occupation;

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}
	

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getMaritalStatusEnumId() {
		return maritalStatusEnumId;
	}

	public void setMaritalStatusEnumId(String maritalStatusEnumId) {
		this.maritalStatusEnumId = maritalStatusEnumId;
	}

	public String getEmploymentStatusEnumId() {
		return employmentStatusEnumId;
	}

	public void setEmploymentStatusEnumId(String employmentStatusEnumId) {
		this.employmentStatusEnumId = employmentStatusEnumId;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public PersonDto() {
		// TODO Auto-generated constructor stub
	}

}
