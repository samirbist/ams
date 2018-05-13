package com.ams.service;

import com.ams.dto.UserDTO;
import com.ams.exception.AmsException;

public interface UserService {

	UserDTO getUser(long userId);

	long addUser(UserDTO user) throws AmsException;

	void updateUser(long userId, UserDTO user);

	void deleteUser(long userId);

}
