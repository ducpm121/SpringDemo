package com.demo.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.springmvc.dao.UserProfileDao;
import com.demo.springmvc.model.UserProfile;

@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService{

	@Autowired 
	UserProfileDao dao;
	public UserProfile findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserProfile findByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserProfile> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
