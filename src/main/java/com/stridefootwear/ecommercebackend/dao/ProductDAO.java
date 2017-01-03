package com.stridefootwear.ecommercebackend.dao;

import java.util.List;

import com.stridefootwear.ecommercebackend.model.Category;
import com.stridefootwear.ecommercebackend.model.Product;


public interface ProductDAO {
	public void save(Product product);

	public void update(Product product);

	public void deleteID(int id);

	public Product get(int id);

	public List<Product> list();
	
	public List<Category>listcatname();
}

