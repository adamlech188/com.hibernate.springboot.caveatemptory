package com.hibernate.caveatemptor.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverride(name = "owner", column = @Column(name = "BA_OWNER", nullable = false))
public class BankAccount extends BillingDetails {

	@Column(name="ACCOUNT")
	private String account;

	@Column(name = "BANK_NAME")
	private String bankname;

	@Column(name="SWIFT")
	private String swift;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getSwift() {
		return swift;
	}

	public void setSwift(String swift) {
		this.swift = swift;
	}

}
