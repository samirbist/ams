package com.ams.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.db.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByRole(String role);

}
