package com.dejan.animalmanager.service;

import org.springframework.stereotype.Service;

import com.dejan.animalmanager.dao.WorkerDAO;
import com.dejan.animalmanager.entity.Worker;

@Service("workerService")
public class WorkerServiceImpl extends GenericServiceImpl<Worker, WorkerDAO> implements WorkerService {

}
