package com.littlehelpbykr.kr.users;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String dob;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aid", referencedColumnName = "id")
	private AddressDetails addressDetails;
	
	public User(){}
	public User(/*int id, */String name, String dob, AddressDetails addressDetails) {
		super();
//		this.id = id;
		this.name = name;
		this.dob = dob;
		this.addressDetails = addressDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public AddressDetails getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(AddressDetails addressDetails) {
		this.addressDetails = addressDetails;
	}

}

