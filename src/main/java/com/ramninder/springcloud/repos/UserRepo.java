package com.ramninder.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramninder.springcloud.models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
