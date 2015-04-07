package com.hibernate.caveatemptor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hibernate.caveatemptor.domain.Item;


@RepositoryRestResource(path = "category" , collectionResourceRel="category")
public interface CatogoryRepository  extends JpaRepository<Item, Long>{

}
