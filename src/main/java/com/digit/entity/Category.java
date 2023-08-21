package com.digit.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Category {
	@Id
	private String catId;
	private String categoryName;
	@OneToMany
	private List<Item> itemList;
	
	
	public Category() {
		super();
	}
	public Category(String catId, String categoryName, List<Item> itemList) {
		super();
		this.catId = catId;
		this.categoryName = categoryName;
		this.itemList = itemList;
	}
	public String getCatId() {
		return catId;
	}
	public void setCatId(String catId) {
		this.catId = catId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	@Override
	public String toString() {
		return "Category [catId=" + catId + ", categoryName=" + categoryName + ", itemList=" + itemList + "]";
	}
	
	

}
