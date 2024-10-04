package com.example.Teacher_portal.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Teacher_portal.model.Role.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	 @Query("SELECT r FROM Role r WHERE r.name = :name")
	    Role findByName(@Param("name") String name);
	
 //   Optional<Role> findByIdWithParentRole(Long id);

	
  
}
