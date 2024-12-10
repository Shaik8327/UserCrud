package com.springboot.UserCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.UserCrud.entity.User;
import com.springboot.UserCrud.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	public List<User> getAll(){
		return (List<User>) userRepo.findAll();
	}
}
