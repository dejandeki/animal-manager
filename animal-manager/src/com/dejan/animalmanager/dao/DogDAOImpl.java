package com.dejan.animalmanager.dao;

import org.springframework.stereotype.Repository;

import com.dejan.animalmanager.entity.Dog;

@Repository("dogDAO")
public class DogDAOImpl extends GenericDAOImpl<Dog> implements DogDAO {

	public DogDAOImpl() {
		super(Dog.class);
		
	}
	
}
