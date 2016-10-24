package com.demo.springmvc.service;

import java.util.List;

import com.demo.springmvc.model.UserProfile;

public interface UserProfileService {
	UserProfile findById(int id);
	UserProfile findByType(String type);
	List<UserProfile> findAll();
}
