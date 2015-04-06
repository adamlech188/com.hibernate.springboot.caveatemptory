package com.hibernate.caveatemptor.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.DiscriminatorFormula;

@Entity
@Table(name = "ITEMS")
@BatchSize(size=10)
@DiscriminatorFormula( "case when ITEM_IS_SPECIAL is not null then A else B end")
public class Item {

	
	@Id
	@GeneratedValue
	private Long id; 
	
	@Column(name="name")
	private String name; 
	
	@Column(name="description")
	private String description; 
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="ITEMS")
	private Set<Category> categoriers = new HashSet<Category>(); 
	
	public Item() { 
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Category> getCategoriers() {
		return categoriers;
	}

	public void setCategoriers(Set<Category> categoriers) {
		this.categoriers = categoriers;
	}
	
   
}
