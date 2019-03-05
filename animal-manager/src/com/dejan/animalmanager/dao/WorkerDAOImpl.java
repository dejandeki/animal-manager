package com.dejan.animalmanager.dao;

import org.springframework.stereotype.Repository;

import com.dejan.animalmanager.entity.Worker;

@Repository("workerDAO")
public class WorkerDAOImpl extends GenericDAOImpl<Worker> implements WorkerDAO {

	public WorkerDAOImpl() {
		super(Worker.class);
		
	}
	
}
