package com.del.foodieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.del.foodieapp.exception.ItemNotFoundException;
import com.del.foodieapp.model.ItemCategory;
import com.del.foodieapp.model.MenuItem;
import com.del.foodieapp.model.Recipe;
import com.del.foodieapp.repository.MenuItemRepository;

@Service
public class MenuItemServiceImpl implements MenuItemService {
	
	private String RECIPE_SERVICE_URL = "http://localhost:8200/recipe/";
	
	RestTemplate recipeService = new RestTemplate();
	
	@Autowired
	private MenuItemRepository repo;

	@Transactional
	public MenuItem addItem(MenuItem item) {
		return repo.save(item);
	}

	@Override
	public MenuItem getItemByCode(long itemCode) {
		if(!repo.existsById(itemCode)) {
			throw new ItemNotFoundException("Menu Item with code "+itemCode+" not found");
		}
		MenuItem item =  repo.findById(itemCode).get();
		Recipe recipe = getRecipce(item.getItemName());
		item.setRecipe(recipe);
		return item;
	}

	@Override
	public List<MenuItem> getAllItems() {
		return repo.findAll();
	}

	@Transactional
	public MenuItem updateItem(MenuItem item) {
		return repo.save(item);
	}

	@Transactional
	public void deleteItem(long itemCode) {
		if(!repo.existsById(itemCode)) {
			throw new ItemNotFoundException("Menu Item with code "+itemCode+" not found");
		}
		repo.deleteById(itemCode);
	}
	
	@Override
	public MenuItem findItemByName(String itemName) {
		return repo.findByItemName(itemName);
	}
	
	@Override
	public List<MenuItem> findItemsByCategory(String category) {
		ItemCategory c = ItemCategory.valueOf(category);
		
		return repo.findByCategory(c);
	}
	
	public Recipe getRecipce(String itemName) {
		return recipeService.getForObject(RECIPE_SERVICE_URL+itemName, Recipe.class);
	}

}
