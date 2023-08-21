package com.digit.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	private LocalDateTime orderDate;
	@OneToOne
	@JoinColumn(name="cartId", referencedColumnName = "cartId")
	private FoodCart cart;
	private String orderSatatus;
	
	
	public OrderDetails() {
		super();
	}


	public OrderDetails(int orderId, LocalDateTime orderDate, FoodCart cart, String orderSatatus) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.cart = cart;
		this.orderSatatus = orderSatatus;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public LocalDateTime getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}


	public FoodCart getCart() {
		return cart;
	}


	public void setCart(FoodCart cart) {
		this.cart = cart;
	}


	public String getOrderSatatus() {
		return orderSatatus;
	}


	public void setOrderSatatus(String orderSatatus) {
		this.orderSatatus = orderSatatus;
	}


	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", orderDate=" + orderDate + ", cart=" + cart + ", orderSatatus="
				+ orderSatatus + "]";
	}
	
	

}
