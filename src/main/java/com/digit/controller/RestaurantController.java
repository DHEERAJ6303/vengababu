package com.digit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.digit.entity.Address;
import com.digit.entity.LogIn;
import com.digit.entity.Restaurant;
import com.digit.formData.RestaurantFormData;
import com.digit.service.AddressService;
import com.digit.service.RestaurantService;
import com.digit.service.UserService;
@Controller
public class RestaurantController {
	@Autowired
	AddressService addressService;
	@Autowired
	UserService userService;
	@Autowired
	RestaurantService restaurantService;
	
	
	@RequestMapping("/res-home/{id}")
	public ModelAndView home(@PathVariable int id) {
		Restaurant restaurant = restaurantService.findById(id);
		ModelAndView mv = new ModelAndView("restaurantHome");
		mv.addObject("data", restaurant);
		return mv;
		
	}
	@RequestMapping("/res-sign-up")
	public ModelAndView ressignup() {
		ModelAndView mv = new ModelAndView("resSignup");
		mv.addObject("resData", new RestaurantFormData());
		return mv;
	}
	@PostMapping("/rest-submit")
	public String addRestaurant(@ModelAttribute RestaurantFormData formData) {
		System.out.println("step1");
		
		Address address = new Address();
		address.setBuildingName(formData.getBuildingName());
		address.setStreetNo(formData.getStreetNo());
		address.setArea(formData.getArea());
		address.setCity(formData.getCity());
		address.setState(formData.getState());
		address.setCountry(formData.getCountry());
		address.setPincode(formData.getPincode());
		
		System.out.println("step2");
		
		Restaurant restaurant = new Restaurant();
		restaurant.setRestaurantName(formData.getRestaurantName());
		restaurant.setManagerName(formData.getManagerName());
		restaurant.setContactNumber(formData.getContactNumber());
		restaurant.setAddress(address);
		
		
		System.out.println("step3");
		
		LogIn login = new LogIn();
		login.setUserName(formData.getUserName());
		login.setPassword(formData.getPassword());
		login.setRestaurant(restaurant);
		
		System.out.println("step4");
		
		System.out.println(addressService.addAddress(address));
		System.out.println(restaurantService.addRestaurant(restaurant));
		System.out.println(userService.addUser(login));
		
		
		System.out.println("step5");
		
		int id = restaurant.getRestaurantId();
		return "redirect:/res-home/"+id;
	}
}
