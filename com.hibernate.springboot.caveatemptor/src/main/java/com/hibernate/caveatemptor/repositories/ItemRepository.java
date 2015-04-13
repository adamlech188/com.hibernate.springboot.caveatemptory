package com.hibernate.caveatemptor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hibernate.caveatemptor.examples.Item;


@RepositoryRestResource(path = "item" , collectionResourceRel="category")
public interface ItemRepository  extends JpaRepository<Item, Long>{

}
