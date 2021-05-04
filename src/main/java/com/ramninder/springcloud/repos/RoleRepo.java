package com.ramninder.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramninder.springcloud.models.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long>{

}
