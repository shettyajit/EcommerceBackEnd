package com.stridefootwear.ecommercebackend.dao.impl;

import java.io.IOException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stridefootwear.ecommercebackend.dao.ShoppingCartDAO;
import com.stridefootwear.ecommercebackend.model.ShoppingCart;

@Repository
@Transactional
public class ShoppingCartDAOImpl  implements ShoppingCartDAO{

	public ShoppingCart getCartById(int Cart_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ShoppingCart validate(int Cart_id) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(ShoppingCart cart) {
		// TODO Auto-generated method stub
		
	}

	
}
