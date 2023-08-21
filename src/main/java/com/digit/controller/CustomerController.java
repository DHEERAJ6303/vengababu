package com.digit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.digit.entity.Address;
import com.digit.entity.Customer;
import com.digit.entity.LogIn;
import com.digit.entity.Restaurant;
import com.digit.formData.CustomerFormData;
import com.digit.formData.RestaurantFormData;
import com.digit.service.AddressService;
import com.digit.service.CustomerService;
import com.digit.service.RestaurantService;
import com.digit.service.UserService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	@Autowired
	AddressService addressService;
	@Autowired
	UserService userService;
	@Autowired
	RestaurantService restaurantService;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/sign-up")
	public ModelAndView signup() {
		ModelAndView mv = new ModelAndView("signUp");
		mv.addObject("customerData", new CustomerFormData());
		return mv;
	}
	
	@PostMapping("/cust-submit")
	public ModelAndView addCustomer(@ModelAttribute CustomerFormData formData) {
		
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
		
		Customer customer = new Customer();
		customer.setFirstName(formData.getFirstName());
		customer.setLastName(formData.getLastName());
		customer.setAge(formData.getAge());
		customer.setGender(formData.getGender());
		customer.setMobileNumber(formData.getMobileNumber());
		customer.setEmail(formData.getEmail());
		customer.setAddress(address);
		
		System.out.println("step3");
		
		LogIn login = new LogIn();
		login.setUserName(formData.getUserName());
		login.setPassword(formData.getPassword());
		login.setCustomer(customer);
		
		System.out.println("step4");
		
		System.out.println(addressService.addAddress(address));
		System.out.println(customerService.addCustomer(customer));
		System.out.println(userService.addUser(login));
		
		
		System.out.println("step5");
		
		ModelAndView mv = new ModelAndView("customerHome");
		mv.addObject("customerData", formData);
		return mv;
		
	}
	@PostMapping("/submit1")
	public ModelAndView submit() {
		ModelAndView mv = new ModelAndView("customerHome");
		return mv;
	}
	
	

}
