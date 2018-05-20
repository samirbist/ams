package com.ams.service;

import com.ams.dto.UserDTO;

public interface UserService {

	UserDTO getUser(long userId) throws Exception;

	long addUser(UserDTO user) throws Exception;

	long updateUser( UserDTO user) throws Exception;

	long deleteUser(String loginName) throws Exception;

	UserDTO getUser(String loginName) throws Exception;

}
