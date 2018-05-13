package com.ams.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.db.entity.Role;

public interface RoleServiceDAO extends JpaRepository<Role, Integer>{

	Role findByRole(String role);

}
