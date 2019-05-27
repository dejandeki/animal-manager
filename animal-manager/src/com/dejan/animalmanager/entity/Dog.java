package com.dejan.animalmanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dog")
public class Dog extends Animal {

	
	public Dog() {
		super();
	}

	public Dog(String name, String breed, String sex, int workerId) {
		super(name,breed,sex,workerId);
	}

	

}
