package com.dejan.animalmanager.service;

import org.springframework.stereotype.Service;

import com.dejan.animalmanager.dao.CatDAO;
import com.dejan.animalmanager.entity.Cat;

@Service("catService")
public class CatServiceImpl extends GenericServiceImpl<Cat, CatDAO> implements CatService{

	

}
