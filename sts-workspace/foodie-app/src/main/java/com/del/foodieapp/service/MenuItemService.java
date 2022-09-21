package com.del.foodieapp.service;

import java.util.List;

import com.del.foodieapp.model.MenuItem;

public interface MenuItemService {

	public MenuItem addItem(MenuItem item);
	
	public MenuItem getItemByCode(long itemCode);
	
	public List<MenuItem> getAllItems();
	
	public MenuItem updateItem(MenuItem item);
	
	public void deleteItem(long itemCode);
	
	
}
