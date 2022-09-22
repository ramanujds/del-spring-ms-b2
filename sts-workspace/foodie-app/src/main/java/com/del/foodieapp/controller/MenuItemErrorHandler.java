package com.del.foodieapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.del.foodieapp.exception.ItemNotFoundException;

@RestControllerAdvice
public class MenuItemErrorHandler {

	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(value = ItemNotFoundException.class)
	public String handleItemNotFoundError(Exception ex) {
		return ex.getMessage();
	}
	
}
