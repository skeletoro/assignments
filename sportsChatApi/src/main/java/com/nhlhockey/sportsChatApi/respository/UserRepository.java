package com.nhlhockey.sportsChatApi.respository;

import org.springframework.data.repository.CrudRepository;

import com.nhlhockey.sportsChatApi.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	public User findByUsername(String username);
}
