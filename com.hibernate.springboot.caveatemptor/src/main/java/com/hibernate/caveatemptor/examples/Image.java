package com.hibernate.caveatemptor.examples;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Parent;

@Embeddable
public class Image {
	
	@Parent
	private Item item; 
	
	@Column(length=255, nullable = false)
	private String name;

	@Column(length=255, nullable = false)
	private String filename;

	@Column(nullable = false)
	private Integer sizeX;

	@Column(nullable = false)
	private Integer sizeY;

	public Image() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Integer getSizeX() {
		return sizeX;
	}

	public void setSizeX(Integer sizeX) {
		this.sizeX = sizeX;
	}

	public Integer getSizeY() {
		return sizeY;
	}

	public void setSizeY(Integer sizeY) {
		this.sizeY = sizeY;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
