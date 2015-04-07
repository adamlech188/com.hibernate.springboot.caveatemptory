package com.hibernate.caveatemptor.domain;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("CC")
public class CreditCard extends BillingDetails {

	
	@Column(name="CC_NUMBER")
	private String number; 
	
	@Column(name="CC_EXPMONTH")
	private String expMonth; 
	
	@Column(name = "CC_EXPYEAR")
	private String expYear; 
	
	public CreditCard() {
		
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(String expMonth) {
		this.expMonth = expMonth;
	}

	public String getExpYear() {
		return expYear;
	}

	public void setExpYear(String expYear) {
		this.expYear = expYear;
	}
	
}
