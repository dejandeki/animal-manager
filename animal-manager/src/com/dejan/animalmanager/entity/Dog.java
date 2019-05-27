package com.dejan.animalmanager.entity;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dog")
public class Dog extends Animal {

	
	public Dog() {}

	public Dog(String name, String breed, String sex, int workerId) {
		super(name,breed,sex,workerId);
	}

	

}
