package com.ams.rest.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ams.service.UserService;
import com.ams.dto.UserDTO;
import com.ams.exception.AmsException;
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users/{userId}")
	public UserDTO getUser(@PathVariable("userId") long userId) {
      UserDTO user = userService.getUser( userId);
      Set<String> roles = new HashSet<String>();
      roles.add("ADMIN");
      user = new UserDTO();
      user.setRoles(roles);
      return user;
	}
	
	
	@PostMapping( "/users")
	public long addUser(@RequestBody UserDTO user) {
      long id = 0L;
	try {
		System.out.println(user);
		id = userService.addUser( user);
	} catch (AmsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
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
