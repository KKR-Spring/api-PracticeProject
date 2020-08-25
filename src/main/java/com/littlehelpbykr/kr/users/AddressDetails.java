package com.littlehelpbykr.kr.users;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Embeddable
public class AddressDetails {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String houseNumber;
	private int aadharNumber;
	private String addressLine1;
	private String addressLine2;
	private String landmark;
	private long pin;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "oid", referencedColumnName = "buildingNumber")
	private OfficeAddress officeAddress;
	public AddressDetails(){}
	public AddressDetails(String houseNumber, int aadharNumber, String addressLine1, String addressLine2,
			String landmark, long pin, OfficeAddress officeAddress) {
		super();
		//this.aid=aid;
		this.houseNumber = houseNumber;
		this.aadharNumber = aadharNumber;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.landmark = landmark;
		this.pin = pin;
		this.officeAddress = officeAddress;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public int getAadharNumber() {
		return aadharNumber;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public String getLandmark() {
		return landmark;
	}
	public long getPin() {
		return pin;
	}
	public OfficeAddress getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(OfficeAddress officeAddress) {
		this.officeAddress = officeAddress;
	}
	
	
}
