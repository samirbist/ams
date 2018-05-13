package com.ams.service;

import com.ams.dto.UserDTO;
import com.ams.exception.AmsException;

public interface UserService {

	UserDTO getUser(long userId) throws AmsException;

	long addUser(UserDTO user) throws AmsException;

	void updateUser( UserDTO user) throws AmsException;

	void deleteUser(String loginName) throws AmsException;

	UserDTO getUser(String loginName) throws AmsException;

}
