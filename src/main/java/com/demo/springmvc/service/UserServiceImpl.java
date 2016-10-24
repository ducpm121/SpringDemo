package com.demo.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.springmvc.dao.UserDao;
import com.demo.springmvc.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao dao;
	
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findBySSO(String sso) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void delelteUserBySSO(String sso) {
		// TODO Auto-generated method stub
		
	}

	public List<User> findAllUser() {
		// TODO Auto-generated method stub		
		return dao.findAllUser();
	}

	public boolean isUserSsoUnique(Integer id, String sso) {
		// TODO Auto-generated method stub
		return false;
	}

}
