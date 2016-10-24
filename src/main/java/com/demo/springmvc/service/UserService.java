package com.demo.springmvc.service;

import java.util.List;

import com.demo.springmvc.model.User;

public interface UserService {
	User findById(int id);
	User findBySSO(String sso);
	void saveUser(User user);
	void updateUser(User user);
	void delelteUserBySSO(String sso);
	List<User> findAllUser();
	boolean isUserSsoUnique(Integer id, String sso);
}
