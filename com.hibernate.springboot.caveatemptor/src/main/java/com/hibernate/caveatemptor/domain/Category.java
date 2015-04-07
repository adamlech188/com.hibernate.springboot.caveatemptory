package com.hibernate.caveatemptor.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="Categories")
public class Category {

	@Id
	@GeneratedValue
	private Long id; 
	
	@Column(name="NAME")
	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="parent_category")
	private Category parentCategory;
	
	@OneToMany(fetch=FetchType.LAZY,  mappedBy="id")
	private Set<Category> childCategories = new HashSet<>();

	public Category() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}

	public Set<Category> getChildCategories() {
		return childCategories;
	}

	public void setChildCategories(Set<Category> childCategories) {
		this.childCategories = childCategories;
	}
	public void addChildCategory(Category childCategory) {
		   if (childCategory == null)
		  throw new IllegalArgumentException("Null child category!");
		   if (childCategory.getParentCategory() != null)
		  childCategory.getParentCategory().getChildCategories()
		               .remove(childCategory);
		  childCategory.setParentCategory(this);
		  childCategories.add(childCategory);
		}
}
