package com.ams.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ams.service.UserService;
import com.ams.dto.UserDTO;

public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users/{userId}")
	public UserDTO getUser(@PathVariable("userId") long userId) {
      UserDTO user = userService.getUser( userId);
      return user;
	}
	
	
	@PostMapping( "/users")
	public long addUser(@RequestBody UserDTO user) {
      long id  = userService.addUser( user);
      return id;
	}
	
	
	@PutMapping( "/users/{userId}")
	public String updateUser(@PathVariable("userId") long userId,@RequestBody  UserDTO user) {
       userService.updateUser( userId,user);
      return "Success";
	}
	
	
	@DeleteMapping(value = "/users/{userId}")
	public String deleteUser(@PathVariable("userId") long userId) {
       userService.deleteUser( userId);
      return "Success";
	}
	
}
