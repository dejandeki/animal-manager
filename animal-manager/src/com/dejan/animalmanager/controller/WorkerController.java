package com.dejan.animalmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dejan.animalmanager.entity.Worker;
import com.dejan.animalmanager.service.WorkerService;

@Controller
@RequestMapping("/worker")
public class WorkerController {

	@Autowired
	private WorkerService workerService;
	
	@GetMapping("/list")
	public String listWorkers(Model theModel) {
		
		// get workers 
		List<Worker> theWorkers = workerService.getAll();
		
		// add to model
		theModel.addAttribute("workers", theWorkers);
		
		return "list-workers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		Worker theWorker = new Worker();

		theModel.addAttribute("worker", theWorker);

		return "worker-form";
	}

	@PostMapping("/saveWorker")
	public String saveWorker(@ModelAttribute("worker") Worker theWorker) {

		workerService.save(theWorker);
		return "redirect:/worker/list";

	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("id") int theId, Model theModel) {

		// get the worker 
		Worker theWorker = workerService.getOne(theId);
		// set worker as a model to pre populate the form
		theModel.addAttribute("worker", theWorker);
		// send to our form
		return "worker-form";
	}


}
