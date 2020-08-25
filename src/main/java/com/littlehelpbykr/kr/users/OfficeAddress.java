package com.littlehelpbykr.kr.users;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Embeddable
public class OfficeAddress {

	@Id
	@GeneratedValue
	private int buildingNumber;
	private String addressLine1;
	private String addressLine2;
	private String landMark;
	private String cardId;
	private long pin;
	
	public OfficeAddress(){}
	public OfficeAddress(String addressLine1, String addressLine2, String landMark, String cardId,
			long pin) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.landMark = landMark;
		this.cardId = cardId;
		this.pin = pin;
	}

	public int getBuildingNumber() {
		return buildingNumber;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public String getLandMark() {
		return landMark;
	}

	public String getCardId() {
		return cardId;
	}

	public long getPin() {
		return pin;
	}

}
