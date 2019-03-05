package com.dejan.animalmanager.service;

import java.util.List;

public interface GenericService<T> {

	
	List<T> getAll();

	void save(T t);

	T getOne(int theId);

	void deleteOne(int theId);
	
    List <T> search(String theSearch);
}
