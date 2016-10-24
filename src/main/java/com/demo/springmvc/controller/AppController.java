package com.demo.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.demo.springmvc.model.User;
import com.demo.springmvc.model.UserProfile;
import com.demo.springmvc.service.UserProfileService;
import com.demo.springmvc.service.UserService;

@Controller
@RequestMapping("/")
@SessionAttributes("roles")
public class AppController {
	@Autowired
	UserService userService;
	@Autowired
	UserProfileService profileService;
	@Autowired
	MessageSource messageSource;
	
	@RequestMapping(value = { "/", "list" }, method = RequestMethod.GET)
	public String listUser(ModelMap mm) {
		List<User> users = userService.findAllUser();
		mm.addAttribute("users", users);
		return "listalluser";
	}

	@ModelAttribute("roles")
	public List<UserProfile> listProfile(){
		return profileService.findAll();
	}
}
