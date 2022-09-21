package com.del.foodieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.del.foodieapp.model.ItemCategory;
import com.del.foodieapp.model.MenuItem;
import com.del.foodieapp.repository.MenuItemRepository;

@Service
public class MenuItemServiceImpl implements MenuItemService {
	
	@Autowired
	private MenuItemRepository repo;

	@Transactional
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

	@Transactional
	public MenuItem updateItem(MenuItem item) {
		return repo.save(item);
	}

	@Transactional
	public void deleteItem(long itemCode) {
		
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

}
