package com.dejan.animalmanager.dao;

import org.springframework.stereotype.Repository;

import com.dejan.animalmanager.entity.Cat;

@Repository("catDAO")
public class CatDAOImpl extends GenericDAOImpl<Cat> implements CatDAO{

	public CatDAOImpl() {
		super(Cat.class);
	}
}
