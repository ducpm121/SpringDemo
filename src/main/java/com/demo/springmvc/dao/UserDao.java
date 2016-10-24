package com.demo.springmvc.dao;

import java.util.List;

import com.demo.springmvc.model.User;

public interface UserDao {
	User findById(int id);
	User findBySso(String sso);
	void save(User user);
	void deleleBySso(String sso);
	List<User> findAllUser();
}
