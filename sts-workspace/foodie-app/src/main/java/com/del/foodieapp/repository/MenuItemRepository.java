package com.del.foodieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.del.foodieapp.model.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

}
