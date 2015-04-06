package com.hibernate.caveatemptor.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AttributeOverride(name="owner" , column = 
@Column(name = "CC_OWNER", nullable=false))
public class CreditCard extends BillingDetails{

	@Id
	@Column(name="CREDIT_CARD_ID")
	private Long id = null; 
	
	@Column(name="NUMBER")
	private String number; 
	
	@Column(name="EXPMONTH")
	private String expMonth; 
	
	@Column(name = "EXPYEAR")
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
