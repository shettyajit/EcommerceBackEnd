package com.stridefootwear.ecommercebackend.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.stridefootwear.ecommercebackend.dao.SupplierDAO;
import com.stridefootwear.ecommercebackend.model.Supplier;

@Repository("SupplierDAO")
public class SupplierDAOImpl implements SupplierDAO{
@Autowired
	SessionFactory sessionFactory;
	@Transactional
	public void save(Supplier supplier) {
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		
	}
	@Transactional
	public void update(Supplier supplier) {
		sessionFactory.getCurrentSession().update(supplier);
		
	}
	@Transactional
	public void delete(int id) {
		Supplier supplier = new Supplier();
		supplier.setId(id);
		sessionFactory.getCurrentSession().delete(supplier);
		
	}
	@Transactional
	public Supplier get(int id) {
		return (Supplier) sessionFactory.getCurrentSession().get(Supplier.class, id);

	}
@Transactional
	public List<Supplier> list() {
//		 String hql ="from Supplier";
//	      Query query=sessionFactory.getCurrentSession().createQuery(hql);
//			return query.list();
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Supplier");
		List<Supplier> supplierList = query.list();
		return supplierList;
	}
	
	

}
