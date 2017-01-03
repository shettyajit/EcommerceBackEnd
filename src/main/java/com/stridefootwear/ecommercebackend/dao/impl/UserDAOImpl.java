package com.stridefootwear.ecommercebackend.dao.impl;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stridefootwear.ecommercebackend.dao.UserDAO;
import com.stridefootwear.ecommercebackend.model.User;



@Repository("UserDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void save(User user) {
		Session session = sessionFactory.getCurrentSession();
	    user.setUserRole("ROLE_USER");
	    session.saveOrUpdate(user);
	}

	@Transactional
	public void update(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

	@Transactional
	public void delete(String userid) {
		User user = new User();
		user.setUserID(userid);
		sessionFactory.getCurrentSession().delete(user);
	}

	@Transactional
	public User get(String id) {
		String hql = "from UserDetails where id=" + "'" + id + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) query.list();

		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		

		return null;
	}

	@Transactional
	public List<User> list() {
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return list;
	}

	@Transactional
	public boolean isValidUser(String id, String name) {
		String hql = "from UserDetails where id= '" + id + "' and " + " password ='" + name + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) query.list();

		if (list != null && !list.isEmpty()) {
			return true;
		}

		return false;
	}

	
}
