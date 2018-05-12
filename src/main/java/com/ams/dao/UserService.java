package com.ams.dao;

import com.ams.dto.UserDto;

public interface UserService {

	UserDto getUser(long userId);

	long addUser(UserDto user);

	void updateUser(long userId, UserDto user);

	void deleteUser(long userId);

}
