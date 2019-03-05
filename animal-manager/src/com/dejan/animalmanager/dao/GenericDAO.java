package com.dejan.animalmanager.dao;

import java.util.List;

public interface GenericDAO<T> {

	List<T> getAll();

	void save(T t);

    T getOne(int theId);

    void deleteOne(int theId);

    List<T> search(String theSearch);
	
	
}
