package com.ams.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ams.dao.UserService;
import com.ams.dto.UserDto;

public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/users/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserDto getUser(@PathVariable("userId") long userId) {
      UserDto user = userService.getUser( userId);
      return user;
	}
	
	
	@RequestMapping(value = "/users", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public long addUser(@RequestBody UserDto user) {
      long id  = userService.addUser( user);
      return id;
	}
	
	
	@RequestMapping(value = "/users/{userId}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateUser(@PathVariable("userId") long userId,@RequestBody  UserDto user) {
       userService.updateUser( userId,user);
      return "Success";
	}
	
	
	@RequestMapping(value = "/users/{userId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteUser(@PathVariable("userId") long userId) {
       userService.deleteUser( userId);
      return "Success";
	}
	
}
