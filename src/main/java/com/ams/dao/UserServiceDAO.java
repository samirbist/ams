package com.ams.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.db.entity.User;
import com.ams.dto.UserDTO;

public interface UserServiceDAO  extends JpaRepository<User, Long>{

	

}
