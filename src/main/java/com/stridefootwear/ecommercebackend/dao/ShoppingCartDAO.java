package com.stridefootwear.ecommercebackend.dao;

import java.io.IOException;

import com.stridefootwear.ecommercebackend.model.ShoppingCart;

public interface ShoppingCartDAO {

	ShoppingCart getCartById(int Cart_id);
	
	ShoppingCart validate(int Cart_id) throws IOException;
	
	void update(ShoppingCart cart);
}