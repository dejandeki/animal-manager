package com.dejan.animalmanager.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.dejan.animalmanager.dao.GenericDAO;

public class GenericServiceImpl<T, T2 extends GenericDAO<T>> implements GenericService<T> {

	@Autowired
	private T2 genericDAO;

	@Override
	@Transactional
	public List<T> getAll() {

		return genericDAO.getAll();
	}

	@Override
	@Transactional
	public void save(T t) {

		genericDAO.save(t);

	}

	@Override
	@Transactional
	public T getOne(int theId) {

		return (T) genericDAO.getOne(theId);
	}

	@Override
	@Transactional
	public void deleteOne(int theId) {

		genericDAO.deleteOne(theId);

	}

	@Override
	@Transactional
	public List<T> search(String theSearch) {

		return genericDAO.search(theSearch);
	}

}
