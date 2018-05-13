package com.ams.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.db.entity.User;
import com.ams.dto.UserDTO;

public interface UserRepository  extends JpaRepository<User, Long>{

	Optional<User> findByLoginName(String loginName);

	

}
