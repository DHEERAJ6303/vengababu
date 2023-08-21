package com.digit.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	@Id
	private int itemId;
	private String itemName;
	@ManyToOne
	@JoinColumn(name="catId", referencedColumnName = "catId")
	private Category category;
	private int quantity;
	private double cost;
	@ManyToMany
	@JoinTable(name="restaurant_item",
    joinColumns = @JoinColumn(name="itemId"),
    inverseJoinColumns = @JoinColumn(name="resturantId"))
	private List<Restaurant> restaurantList;
	@ManyToMany
	@JoinTable(name="cart_item",
    joinColumns = @JoinColumn(name="itemId"),
    inverseJoinColumns = @JoinColumn(name="cartId"))
	private List<FoodCart> cartList;
	public Item() {
		super();
	}
	public Item(int itemId, String itemName, Category category, int quantity, double cost,
			List<Restaurant> restaurantList) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.category = category;
		this.quantity = quantity;
		this.cost = cost;
		this.restaurantList = restaurantList;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public List<Restaurant> getRestaurantList() {
		return restaurantList;
	}
	public void setRestaurantList(List<Restaurant> restaurantList) {
		this.restaurantList = restaurantList;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", category=" + category + ", quantity=" + quantity
				+ ", cost=" + cost + ", restaurantList=" + restaurantList + "]";
	}
	
	

}
