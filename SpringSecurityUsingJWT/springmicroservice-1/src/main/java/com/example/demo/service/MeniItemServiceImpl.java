package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.client.AuthClient;
import com.example.demo.entity.MenuItem;
import com.example.demo.exception.MenuItemNotFoundException;
import com.example.demo.exception.TokenExpiredException;
import com.example.demo.model.AuthResponse;
import com.example.demo.repository.MenuItemRepository;

@Service
public class MeniItemServiceImpl implements MenuItemService{
    @Autowired
	MenuItemRepository menuRepo;
	@Autowired
    AuthClient authClient;
    
	@Override
	public List<MenuItem> getMenus(final String token) {
		AuthResponse response = authClient.getValidity(token);
		
		if(response.isValid()) {
		List<MenuItem> list = menuRepo.findAll();
		return list;
		}
		else
			throw new TokenExpiredException("Token is Expired ");
	}

	@Override
	public MenuItem getMenuItemById(final String token,int id) {
		AuthResponse response = authClient.getValidity(token);
		if(response.isValid()) {
		MenuItem item = menuRepo.findById(id).orElse(null);
		if(item!=null)
			return item;
		else
			throw new MenuItemNotFoundException("Menu Id not found");
		}
		else
			throw new TokenExpiredException("Token is Expired ");
		
	}

}
