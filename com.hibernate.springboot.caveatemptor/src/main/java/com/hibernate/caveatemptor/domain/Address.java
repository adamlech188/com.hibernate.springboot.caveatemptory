package com.hibernate.caveatemptor.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Column(name="ADDRESS_STREET" , nullable=false)
	private String street;
	
	@Column(name="ADDRESS_ZIPCODE", nullable=false)
	private String zipCode;
	
	@Column(name="ADDRESS_CITY", nullable=false)
	private String city;

	public Address() {

	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
