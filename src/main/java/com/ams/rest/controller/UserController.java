package com.ams.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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

	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/users/id/{userId}")
	public ResponseEntity<UserDTO> getUser(@PathVariable("userId") long userId) throws AmsException {

		try {
			UserDTO user = userService.getUser(userId);
			return new ResponseEntity<UserDTO>(user, HttpStatus.OK);
		} catch (Exception e) {
			throw new AmsException(e);
		}

	}

	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/users/name/{loginName}")
	public ResponseEntity<UserDTO> getUser(@PathVariable("loginName") String loginName) throws AmsException {

		try {
			UserDTO user = userService.getUser(loginName);
			return new ResponseEntity<UserDTO>(user, HttpStatus.OK);
		} catch (Exception e) {
			throw new AmsException(e);
		}

	}

	@PostMapping("/users")
	public ResponseEntity<Long> addUser(@RequestBody UserDTO user) throws AmsException {
		try {
			long id = userService.addUser(user);
			return new ResponseEntity<Long>(id, HttpStatus.OK);
		} catch (Exception e) {
			throw new AmsException(e);
		}

	}

	@PutMapping("/users")
	public ResponseEntity<Long> updateUser(@RequestBody UserDTO user) throws AmsException {

		try {
			long id = userService.updateUser(user);
			return new ResponseEntity<Long>(id, HttpStatus.OK);
		} catch (Exception e) {
			throw new AmsException(e);
		}

	}

	@PreAuthorize("hasAnyRole('ADMIN')")
	@DeleteMapping(value = "/users/{loginName}")
	public ResponseEntity<Long> deleteUser(@PathVariable("loginName") String loginName) throws AmsException {

		try {
			long id = userService.deleteUser(loginName);
			return new ResponseEntity<Long>(id, HttpStatus.OK);
		} catch (Exception e) {
			throw new AmsException(e);
		}

	}

}
