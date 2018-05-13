package com.ams.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ams.dto.UserDTO;
import com.ams.exception.AmsException;
import com.ams.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users/{userId}")
	public UserDTO getUser(@PathVariable("userId") long userId) throws AmsException {
		UserDTO user = userService.getUser(userId);
		return user;
	}

	@GetMapping("/user/{loginName}")
	public UserDTO getUser(@PathVariable("loginName") String loginName) throws AmsException {
		UserDTO user = userService.getUser(loginName);
		return user;
	}

	@PostMapping("/users")
	public long addUser(@RequestBody UserDTO user) throws AmsException {

		long id = userService.addUser(user);
		return id;
	}

	@PutMapping("/users")
	public String updateUser(@RequestBody UserDTO user) throws AmsException {
		userService.updateUser(user);
		return "Success";
	}

	@DeleteMapping(value = "/users/{loginName}")
	public String deleteUser(@PathVariable("userId") String loginName) throws AmsException {
		userService.deleteUser(loginName);
		return "Success";
	}

}
