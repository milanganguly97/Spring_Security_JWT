package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MenuItem {
@Id
private int menuId;
private String menuName;
private int menuPrice;
private String menuCategory;
public int getMenuId() {
	return menuId;
}
public void setMenuId(int menuId) {
	this.menuId = menuId;
}
public String getMenuName() {
	return menuName;
}
public void setMenuName(String menuName) {
	this.menuName = menuName;
}
public int getMenuPrice() {
	return menuPrice;
}
public void setMenuPrice(int menuPrice) {
	this.menuPrice = menuPrice;
}
public String getMenuCategory() {
	return menuCategory;
}
public void setMenuCategory(String menuCategory) {
	this.menuCategory = menuCategory;
}

}
