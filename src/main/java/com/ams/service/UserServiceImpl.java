package com.ams.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.db.entity.Role;
import com.ams.db.entity.User;
import com.ams.dto.UserDTO;
import com.ams.exception.AmsException;
import com.ams.repository.RoleRepository;
import com.ams.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userDAO;

	@Autowired
	private RoleRepository roleDAO;

	@Override
	public UserDTO getUser(long userId) throws AmsException {
		Optional<User> optionalUsers = userDAO.findById(userId);
		optionalUsers.orElseThrow(() -> new AmsException("User not found"));
		User user = optionalUsers.get();
		Set<String> roles = null;
		for (Role role : user.getRoles()) {
			if (roles == null) {
				roles = new HashSet<String>();
			}

			roles.add(role.getRole());
		}
		UserDTO userDTO = new UserDTO(user.getGennPID(), user.getPin(), user.getGivenName(), user.getFamilyName(),
				user.getMiddleName(), user.getEmail(), user.getCompanyName(), user.getCommentTXT(), user.getLoginName(),
				user.getPassword(), user.getApprovedIND(), roles);
		return userDTO;
	}

	@Override
	public long addUser(UserDTO userDto) throws AmsException {
		Set<Role> roleSet = null;
		if (userDto.getRoles() != null) {
			roleSet = new HashSet<>();
			for (String role : userDto.getRoles()) {
				Role roleEntity = roleDAO.findByRole(role);
				roleSet.add(roleEntity);
			}
		} else {
			throw new AmsException("Role is missing");
		}

		User user = new User(userDto.getLoginName(), userDto.getPassword(), userDto.getPin(), userDto.getGivenName(),
				userDto.getFamilyName(), userDto.getMiddleName(), userDto.getEmail(), userDto.getCompanyName(),
				userDto.getCommentTXT(), roleSet);

		user = userDAO.save(user);

		return user.getGennPID();
	}

	@Override
	public void updateUser(UserDTO userDto) throws AmsException {

		Optional<User> optionalUsers = userDAO.findById(userDto.getId());
		optionalUsers.orElseThrow(() -> new AmsException("Username not found"));

		User userToUpdate = optionalUsers.get();

		if (userDto.getLoginName() != null)
			userToUpdate.setLoginName(userDto.getLoginName());

		if (userDto.getPassword() != null)
			userToUpdate.setPassword(userDto.getPassword());

		if (userDto.getPin() != null)
			userToUpdate.setPin(userDto.getPin());

		if (userDto.getGivenName() != null)
			userToUpdate.setGivenName(userDto.getGivenName());

		if (userDto.getFamilyName() != null)
			userToUpdate.setFamilyName(userDto.getFamilyName());

		if (userDto.getMiddleName() != null)
			userToUpdate.setMiddleName(userDto.getMiddleName());

		if (userDto.getEmail() != null)
			userToUpdate.setEmail(userDto.getEmail());

		if (userDto.getCompanyName() != null)
			userToUpdate.setCompanyName(userDto.getCompanyName());

		if (userDto.getCommentTXT() != null)
			userToUpdate.setCommentTXT(userDto.getCommentTXT());

		if (userDto.getApprovedIND() != null)
			userToUpdate.setApprovedIND(userDto.getApprovedIND());

		if (userDto.getRoles() != null) {
			Set<Role> roleSet = new HashSet<Role>();
			for (String role : userDto.getRoles()) {
				Role roleEntity = roleDAO.findByRole(role);
				roleSet.add(roleEntity);
			}
			userToUpdate.setRoles(roleSet);
		}
		userDAO.save(userToUpdate);

	}

	@Override
	public void deleteUser(String loginName) throws AmsException {

		Optional<User> optionalUsers  = userDAO.findByLoginName(loginName);
		optionalUsers.orElseThrow(() -> new AmsException("User not found"));
		userDAO.delete(optionalUsers.get());
	}

	@Override
	public UserDTO getUser(String loginName) throws AmsException {
		Optional<User> optionalUsers = userDAO.findByLoginName(loginName);
		optionalUsers.orElseThrow(() -> new AmsException("User not found"));
		User user = optionalUsers.get();
		Set<String> roles = null;
		for (Role role : user.getRoles()) {
			if (roles == null) {
				roles = new HashSet<String>();
			}

			roles.add(role.getRole());
		}
		UserDTO userDTO = new UserDTO(user.getGennPID(), user.getPin(), user.getGivenName(), user.getFamilyName(),
				user.getMiddleName(), user.getEmail(), user.getCompanyName(), user.getCommentTXT(), user.getLoginName(),
				user.getPassword(), user.getApprovedIND(), roles);
		return userDTO;
	}

}
