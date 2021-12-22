package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.MenuItem;
import com.example.demo.service.MenuItemService;

@RestController
public class MenuItemController {
    @Autowired
	MenuItemService menuService;
	
	@GetMapping(value = "/menuitems")
	public ResponseEntity< List<MenuItem>> getMenus(@RequestHeader("Authorization") final String token){
		List<MenuItem> list = menuService.getMenus(token);
		ResponseEntity<List<MenuItem>> entity = new ResponseEntity<List<MenuItem>>(list, HttpStatus.OK);
		return entity;
	}
	
	@GetMapping(value = "/menuitembyid/{id}")
	public ResponseEntity<MenuItem> getMenuItemById(@RequestHeader("Authorization") final String token, @PathVariable int id) {
		MenuItem menu = menuService.getMenuItemById(token, id);
		ResponseEntity<MenuItem> entity = new ResponseEntity<MenuItem>(menu, HttpStatus.OK);
		return entity;
	}
}
