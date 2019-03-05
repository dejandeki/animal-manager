package com.dejan.animalmanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dog")
public class Dog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "dogBreed")
	private String breed;
	@Column(name = "sex")
	private String sex;
	@Column(name = "workerId")
	private int workerId;

	public Dog() {
	}

	public Dog(String name, String breed, String sex, int workerId) {
		this.name = name;
		this.breed = breed;
		this.sex = sex;
		this.workerId = workerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getWorkerId() {
		return workerId;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", dogBreed=" + breed + ", sex=" + sex + ", workerId=" + workerId
				+ "]";
	}

}
