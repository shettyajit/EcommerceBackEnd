package com.stridefootwear.ecommercebackend.dao;

import java.util.List;

import com.stridefootwear.ecommercebackend.model.User;



public interface UserDAO {

	public void save(User user);

	public void update(User user);

	public void delete(String userid);

	public User get(String userid);

	public List<User> list();
	
	

}
