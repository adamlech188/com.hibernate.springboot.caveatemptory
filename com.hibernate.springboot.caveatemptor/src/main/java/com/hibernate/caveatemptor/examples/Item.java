package com.hibernate.caveatemptor.examples;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;

@Entity
@Table(name = "ITEMS")
@BatchSize(size=10)
public class Item {

	
	@Id
	@GeneratedValue
	@Column(name="ITEM_ID")
	private Long id; 
	
	@Column(name="name")
	private String name; 
	
	@Column(name="description")
	private String description; 
	
	@Column(name="initial_price")
	private BigDecimal intialPrice; 
	
	@Column(name="reserve_price")
	private BigDecimal reservePrice; 
	
	@Column(name="start_date")
	private Date startDate; 
	
	@Column(name="end_date")
	private Date endDate; 
	
	@Column(name = "approval_datetime")
	private Date approvalDatetime;

    @CollectionTable(name="ITEM_IMAGE", joinColumns=@JoinColumn(name="ITEM_ID"))
    @ElementCollection(targetClass=Image.class)
    @Column(name="FILE_NAME", nullable=false)
	private Set<Image> images = new HashSet<Image>(); 

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
}
