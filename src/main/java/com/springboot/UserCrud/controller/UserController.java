package com.springboot.UserCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.UserCrud.entity.User;
import com.springboot.UserCrud.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/allUsers")
	public List<User> getAllUsers() {
		return userService.getAll();
	}
}
