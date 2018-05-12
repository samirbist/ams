package com.ams.service;

import com.ams.dto.UserDTO;

public interface UserService {

	UserDTO getUser(long userId);

	long addUser(UserDTO user);

	void updateUser(long userId, UserDTO user);

	void deleteUser(long userId);

}
