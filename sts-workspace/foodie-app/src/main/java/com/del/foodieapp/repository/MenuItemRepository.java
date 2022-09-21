package com.del.foodieapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.del.foodieapp.model.ItemCategory;
import com.del.foodieapp.model.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

	//@Query("from MenuItem where itemName=:itemName")
	public MenuItem findByItemName(String itemName);
	
	public List<MenuItem> findByCategory(ItemCategory category);
	
}
