package com.hotwax.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PARTY_ID", nullable = false)
    private Long partyId;

    @OneToOne
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    private Party party;

    @Column(name = "SALUTATION", length = 255)
    private String salutation;

    @Column(name = "FIRST_NAME", length = 255)
    private String firstName;

    @Column(name = "MIDDLE_NAME", length = 255)
    private String middleName;

    @Column(name = "LAST_NAME", length = 255)
    private String lastName;

    @Column(name = "GENDER", length = 1)
    private Character gender;

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @Column(name = "MARITAL_STATUS_ENUM_ID", length = 40)
    private String maritalStatusEnumId;

    @Column(name = "EMPLOYMENT_STATUS_ENUM_ID", length = 40)
    private String employmentStatusEnumId;

    @Column(name = "OCCUPATION", length = 255)
    private String occupation;


	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Long getPartyId() {
		return partyId;
	}

	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
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

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public LocalDate getBirthDate() {
		return birthDate;
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
	
	

    

}
