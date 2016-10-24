package com.demo.springmvc.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.springmvc.model.User;


@Repository("userDao")
public class UserDaoImpl extends AbtractDao<Integer, User> implements UserDao{

	public User findById(int id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	public User findBySso(String sso) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

	public void deleleBySso(String sso) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		List<User> listuser = getEntityManager()
				.createQuery("SELECT u FROM User u ORDER BY u.firstname ASC")
				.getResultList();
		return listuser;
	}
	
	
	protected void initializeCollection(Collection<?> collection) {
		if (collection==null) {
			return;
		}
		collection.iterator().hasNext();
	}

}
