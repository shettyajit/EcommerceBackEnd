package com.stridefootwear.ecommercebackend.dao;

import java.util.List;

import com.stridefootwear.ecommercebackend.model.Category;

public interface CategoryDAO {

	public void save(Category category);

	public void update(Category category);

	public void delete(int id);

	public Category get(int id);

	public List<Category> list();
}
