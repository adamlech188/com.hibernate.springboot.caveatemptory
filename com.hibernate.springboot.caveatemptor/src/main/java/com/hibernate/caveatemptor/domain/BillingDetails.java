package com.hibernate.caveatemptor.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "BILLING_DETAILS_TYPE", discriminatorType = DiscriminatorType.STRING)
public abstract class BillingDetails {

	@Id
	@GeneratedValue
	@Column(name = "BILLING_DETAILS_ID")
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
