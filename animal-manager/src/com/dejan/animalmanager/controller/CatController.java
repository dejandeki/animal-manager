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

import com.dejan.animalmanager.entity.Cat;
import com.dejan.animalmanager.service.CatService;


@Controller
@RequestMapping("/cat")
public class CatController {

	@Autowired
	private CatService catService;

	@GetMapping("/list")
	public String listCats(Model theModel) {

		// get cats 
		List<Cat> theCats = catService.getAll();

		// add the cats to the model
		theModel.addAttribute("cats", theCats);

		return "list-cats";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		Cat theCat = new Cat();

		theModel.addAttribute("cat", theCat);

		return "cat-form";
	}

	@PostMapping("/saveCat")
	public String saveCat(@ModelAttribute("cat") Cat theCat) {

		catService.save(theCat);
		return "redirect:/cat/list";

	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("id") int theId, Model theModel) {

		// get the cat 
		Cat theCat = catService.getOne(theId);
		// set cat as a model to pre-populate the form
		theModel.addAttribute("cat", theCat);
		// send to our form
		return "cat-form";
	}

	@GetMapping("/delete")
	public String deleteCat(@RequestParam("id") int theId) {

		// delete the cat
		catService.deleteOne(theId);

		return "redirect:/cat/list";
	}

	@GetMapping("/search")
	public String searchCats(@RequestParam("theSearch") String theSearch, Model theModel) {

		List<Cat> theCats = catService.search(theSearch);

		theModel.addAttribute("cats", theCats);

		return "list-cats";
	}
}
