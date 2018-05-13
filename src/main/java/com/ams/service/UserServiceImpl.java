package com.ams.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.dao.RoleServiceDAO;
import com.ams.dao.UserServiceDAO;
import com.ams.db.entity.Role;
import com.ams.db.entity.User;
import com.ams.dto.UserDTO;
import com.ams.exception.AmsException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserServiceDAO userDAO;
	
	@Autowired 
	private RoleServiceDAO roleDAO;

	@Override
	public UserDTO getUser(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long addUser(UserDTO userDto) throws AmsException {

		Set<Role> roleSet = null;
		if (userDto.getRoles() != null) {
			 roleSet = new HashSet<>();
			for (String role : userDto.getRoles()) {
				Role roleEntity =	roleDAO.findByRole(role);
				roleSet.add(roleEntity);
			}
		}else {
			throw new AmsException("Role is missing");
		}

		User user = new User(userDto.getLoginName(), userDto.getPassword(), userDto.getPin(), userDto.getGivenName(),
				userDto.getFamilyName(), userDto.getMiddleName(), userDto.getEmail(), userDto.getCompanyName(),
				userDto.getCommentTXT(), roleSet);
		
		user = userDAO.save(user);

		return user.getGennPID();
	}

	@Override
	public void updateUser(long userId, UserDTO user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(long userId) {
		// TODO Auto-generated method stub

	}

}
