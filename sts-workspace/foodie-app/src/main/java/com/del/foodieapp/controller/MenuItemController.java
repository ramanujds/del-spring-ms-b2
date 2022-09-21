package com.del.foodieapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.del.foodieapp.model.MenuItem;
import com.del.foodieapp.service.MenuItemService;

@RestController
@RequestMapping("/menu")
public class MenuItemController {

	@Autowired
	private MenuItemService service;
	
	@GetMapping("/items/{code}")
	public MenuItem getItem(@PathVariable("code") long itemCode) {
		return service.getItemByCode(itemCode);
	}
	
	@GetMapping
	public List<MenuItem> getAllItems(){
		return service.getAllItems();
	}
	
	@PostMapping("/items")
	public MenuItem addItem(@RequestBody MenuItem item) {
		return service.addItem(item);
	}
	
	@GetMapping("/items/name/{itemName}")
	public MenuItem getMenuItemByName(@PathVariable String itemName) {
		return service.findItemByName(itemName);
	}
	
	@GetMapping("/{category}")
	public List<MenuItem> getAllItemsByCategory(@PathVariable String category){
		return service.findItemsByCategory(category);
	}
	
	
}
