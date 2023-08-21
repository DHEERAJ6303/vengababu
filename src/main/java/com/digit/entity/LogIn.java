package com.digit.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class LogIn implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String userName;
	private String password;
	@OneToOne
	@JoinColumn(name = "customerId", referencedColumnName = "customerId")
	private Customer customer;
	@OneToOne
	@JoinColumn(name = "restaurantId", referencedColumnName = "restaurantId")
	private Restaurant restaurant;

	public LogIn() {
		super();
	}

	public LogIn(String userName, String password, Customer customer, Restaurant restaurant) {
		super();
		this.userName = userName;
		this.password = password;
		this.customer = customer;
		this.restaurant = restaurant;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public String toString() {
		return "LogIn [userName=" + userName + ", password=" + password + ", customer=" + customer + ", restaurant="
				+ restaurant + "]";
	}

}
