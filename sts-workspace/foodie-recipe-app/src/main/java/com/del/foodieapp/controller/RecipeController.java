package com.del.foodieapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.del.foodieapp.model.Recipe;
import com.del.foodieapp.service.RecipeService;


@RestController
public class RecipeController {
	
	@Autowired
	RecipeService service;
	
	@GetMapping("/recipe/{itemName}")
	public Recipe findRecipe(@PathVariable String itemName) {
		return service.getRecipe(itemName);
	}

}
