package com.demo.springmvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.springmvc.model.UserProfile;

@Repository("userProfileDao")
public class UserProfileDaoImpl extends AbtractDao<Integer, UserProfile> implements UserProfileDao{

	@SuppressWarnings("unchecked")
	public List<UserProfile> findAll() {
		// TODO Auto-generated method stub
		List<UserProfile> listProfile= entityManager.createQuery("SELECT p FROM UserProfile p ORDER BY p.type ASC").getResultList();
		return listProfile;		
	}

	public UserProfile findByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public UserProfile findById(int id) {
		return null;
	}

}
