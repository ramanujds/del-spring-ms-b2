package com.del.foodieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.del.foodieapp.model.MenuItem;
import com.del.foodieapp.repository.MenuItemRepository;

public class MenuItemServiceImpl implements MenuItemService {
	
	@Autowired
	private MenuItemRepository repo;

	@Override
	public MenuItem addItem(MenuItem item) {
		return repo.save(item);
	}

	@Override
	public MenuItem getItemByCode(long itemCode) {
		
		return repo.findById(itemCode).get();
	}

	@Override
	public List<MenuItem> getAllItems() {
		return repo.findAll();
	}

	@Override
	public MenuItem updateItem(MenuItem item) {
		return repo.save(item);
	}

	@Override
	public void deleteItem(long itemCode) {
		
		repo.deleteById(itemCode);
	}

}
