package com.dejan.animalmanager.service;

import org.springframework.stereotype.Service;

import com.dejan.animalmanager.dao.DogDAO;
import com.dejan.animalmanager.entity.Dog;

@Service("dogService")
public class DogServiceImpl extends GenericServiceImpl<Dog, DogDAO> implements DogService{

}
