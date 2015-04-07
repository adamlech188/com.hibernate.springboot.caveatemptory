package com.hibernate.caveatemptor.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BillingDetails {

	@Id 
	@GeneratedValue
	private Long id; 
	
	@Column(name = "OWNER", nullable = false)
	private String owner;

	public BillingDetails() {

	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
