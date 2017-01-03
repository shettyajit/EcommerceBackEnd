package com.stridefootwear.ecommercebackend.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stridefootwear.ecommercebackend.dao.ProductDAO;
import com.stridefootwear.ecommercebackend.model.Category;
import com.stridefootwear.ecommercebackend.model.Product;
@Transactional

@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	ProductDAO prdao;
	@Transactional
	public void save(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		
	}
	@Transactional
	public void update(Product product) {
		sessionFactory.getCurrentSession().update(product);
	}
@Transactional
	public void deleteID(int id) {
		Product Product = new Product();
		Product.setProductid(id);
		sessionFactory.getCurrentSession().delete(Product);
		
	}
	@Transactional
	public Product get(int id) {
		return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
		
	}
	@Transactional
	public List<Product> list() {
		 String hql="from Product";
		 Query query=sessionFactory.getCurrentSession().createQuery(hql);
		 	return query.list();
	}
	public List<Category> listcatname() {
		 String hql="select category_name from Category";
		 Query query=sessionFactory.getCurrentSession().createQuery(hql);
		 	return query.list();
	}
	
}
