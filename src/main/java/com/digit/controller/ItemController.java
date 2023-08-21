package com.digit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.digit.entity.Category;
import com.digit.entity.Item;
import com.digit.entity.Restaurant;
import com.digit.formData.ItemFormData;
import com.digit.service.ItemService;
import com.digit.service.RestaurantService;

@Controller
public class ItemController {
	@Autowired
	ItemService itemService;
	
	@Autowired
	RestaurantService restaurantService;
	
	@RequestMapping("/add-item/{id}")
	public ModelAndView addItem(@PathVariable int id) {
		ModelAndView mv = new ModelAndView("addItem");
		mv.addObject("item", new ItemFormData());
		mv.addObject("id", id);
		return mv;
	}
	@PostMapping("/item-submit/{id}")
	public String saveItem(@ModelAttribute ItemFormData formData, @PathVariable int id) {
		Category category = new Category();
		category.setCatId(formData.getCatId());
		
		Item item = new Item();
		item.setCost(formData.getCost());
		item.setItemName(formData.getItemName());
		item.setQuantity(formData.getQuantity());
		item.setCategory(category);
		
		Restaurant restaurant = restaurantService.findById(id);
		List<Item> listItem = restaurant.getItemList();
		listItem.add(item);
		restaurant.setItemList(listItem);
		return "redirec:/res-home/"+id;
	}

}
