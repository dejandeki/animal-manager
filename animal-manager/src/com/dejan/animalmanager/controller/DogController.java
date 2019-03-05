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

import com.dejan.animalmanager.entity.Dog;
import com.dejan.animalmanager.service.DogService;


@Controller
@RequestMapping("/dog")
public class DogController {

	@Autowired
	private DogService dogService;

	@GetMapping("/list")
	public String listDogs(Model theModel) {

		// get dogs 
		List<Dog> theDogs = dogService.getAll();

		// add the dogs to the model
		theModel.addAttribute("dogs", theDogs);

		return "list-dogs";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		Dog theDog = new Dog();

		theModel.addAttribute("dog", theDog);

		return "dog-form";
	}

	@PostMapping("/saveDog")
	public String saveDog(@ModelAttribute("dog") Dog theDog) {

		dogService.save(theDog);
		return "redirect:/dog/list";

	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("id") int theId, Model theModel) {

		// get the dog 
		Dog theDog = dogService.getOne(theId);
		// set dog as a model to pre populate the form
		theModel.addAttribute("dog", theDog);
		// send to our form
		return "dog-form";
	}

	@GetMapping("/delete")
	public String deleteDog(@RequestParam("id") int theId) {

		// delete the dog
		dogService.deleteOne(theId);

		return "redirect:/dog/list";
	}

	@GetMapping("/search")
	public String searchDogs(@RequestParam("theSearch") String theSearch, Model theModel) {

		List<Dog> theDogs = dogService.search(theSearch);

		theModel.addAttribute("dogs", theDogs);

		return "list-dogs";
	}
}
