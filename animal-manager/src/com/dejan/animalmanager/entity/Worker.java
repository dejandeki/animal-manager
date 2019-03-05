package com.dejan.animalmanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "worker")
public class Worker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "telephone")
	private String telephone;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@Column(name = "active")
	private String active;

	public Worker() {
	}

	public Worker(String firstName, String lastName, String telephone, String address, String city,
			String active) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.address = address;
		this.city = city;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Worker [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", telephone=" + telephone
				+ ", address=" + address + ", city=" + city + ", active=" + active + "]";
	}

}
