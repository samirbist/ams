package com.ams.service;

import com.ams.dto.UserDTO;

public interface UserService {

	UserDTO getUser(long userId);

	long addUser(UserDTO user);

	long updateUser( UserDTO user);

	long deleteUser(String loginName);

	UserDTO getUser(String loginName);

}
