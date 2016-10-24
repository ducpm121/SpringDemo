package com.demo.springmvc.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.demo.springmvc.model.UserProfile;
import com.demo.springmvc.service.UserProfileService;

@Component
public class RoleToUserProfileConverter implements Converter<Object, UserProfile>{

	@Autowired
	UserProfileService userProfileService;
	public UserProfile convert(Object element) {
		// TODO Auto-generated method stub
		Integer id= Integer.parseInt((String) element);
		UserProfile profile =userProfileService.findById(id);
		System.out.println("Profile"+ profile);
		return profile;
	}
	
}
