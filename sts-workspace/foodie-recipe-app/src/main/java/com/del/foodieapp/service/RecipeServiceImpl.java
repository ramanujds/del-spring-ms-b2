package com.del.foodieapp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.del.foodieapp.model.Recipe;

@Service
public class RecipeServiceImpl implements RecipeService {
	
	String recipeUri = "https://www.themealdb.com/api/json/v1/1/search.php?s=";
	
	RestTemplate recipeClient = new RestTemplate();
	
	@Override
	public Recipe getRecipe(String itemName) {
		
		Recipe recipe = recipeClient.getForObject(recipeUri+itemName, Recipe.class);
		return recipe;
		
	}

}
