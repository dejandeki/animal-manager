package com.dejan.animalmanager.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cat")
public class Cat extends Animal {

	public Cat() {}

	public Cat(String name, String breed, String sex, int workerId) {
		super(name, breed, sex, workerId);
		
	}

	
}
