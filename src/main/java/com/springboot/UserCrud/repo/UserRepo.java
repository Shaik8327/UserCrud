package com.springboot.UserCrud.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.springboot.UserCrud.entity.User;

@Component
public interface UserRepo extends CrudRepository<User, Integer>{

}
