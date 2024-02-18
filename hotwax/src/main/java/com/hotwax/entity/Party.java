package com.hotwax.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "party")
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PARTY_ID", nullable = false)
    private Long partyId;

    @OneToMany(mappedBy = "party")
    private List<Person> persons;

	public Party() {
		// TODO Auto-generated constructor stub
	}

	public Long getPartyId() {
		return partyId;
	}

	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
	

    

}
