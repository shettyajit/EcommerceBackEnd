package com.stridefootwear.ecommercebackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table


public class ShoppingCart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Cart_id;
	
	@Column
	private double Cart_total;
	@OneToOne(mappedBy="shoppingCart")
	private User user;
	public int getCart_id() {
		return Cart_id;
	}
	public void setCart_id(int cart_id) {
		Cart_id = cart_id;
	}
	public double getCart_total() {
		return Cart_total;
	}
	public void setCart_total(double cart_total) {
		Cart_total = cart_total;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
