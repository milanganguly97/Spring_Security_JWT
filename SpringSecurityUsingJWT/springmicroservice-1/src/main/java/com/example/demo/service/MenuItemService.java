package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.MenuItem;

public interface MenuItemService {
  public List<MenuItem> getMenus(final String token);
  public MenuItem getMenuItemById(final String token, int id);
}
