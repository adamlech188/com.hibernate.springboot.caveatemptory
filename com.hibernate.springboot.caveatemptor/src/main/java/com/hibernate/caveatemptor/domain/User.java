package com.hibernate.caveatemptor.domain;

import java.io.Serializable;
import java.util.StringTokenizer;

import javax.naming.InvalidNameException;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="USERS")
public class User implements Serializable {

	@Id
	@Column(name="first_name")
	private String firstname; 
	
	@Id
	@Column(name="last_name")
	private String lastname; 
	
	@Column(name="username")
	private String username; 
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email; 
	
	@Column(name="ranking")
	private Integer ranking; 
	
	@Column(name="admin")
	private Boolean admin; 
	
	@Embedded
	private Address homeAddress; 
	
	
	public User() { 
		
	}
	public String getName() {
		return firstname + ' ' + lastname; 
	}
	
	public void setName(String name) {
		StringTokenizer t = new StringTokenizer(name); 
		firstname= t.nextToken(); 
		lastname = t.nextToken(); 
		
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) throws InvalidNameException {
		
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getRanking() {
		return ranking;
	}
	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	
	
	
}
