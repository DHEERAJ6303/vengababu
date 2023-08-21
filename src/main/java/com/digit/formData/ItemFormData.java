package com.digit.formData;

public class ItemFormData {

	private String itemName;
	private String catId;
	private String categoryName;
	private int quantity;
	private double cost;

	public ItemFormData() {
		super();
	}

	public ItemFormData(String itemName, String catId, String categoryName, int quantity, double cost) {
		super();
		this.itemName = itemName;
		this.catId = catId;
		this.categoryName = categoryName;
		this.quantity = quantity;
		this.cost = cost;
	}

	public String getCatId() {
		return catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	@Override
	public String toString() {
		return "ItemFormData [itemName=" + itemName + ", catId=" + catId + ", categoryName=" + categoryName
				+ ", quantity=" + quantity + ", cost=" + cost + "]";
	}

}
