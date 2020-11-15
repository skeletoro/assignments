package com.promineotechschool.programmingSchoolApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotechschool.programmingSchoolApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

	public User FindByUsername(String username);
}
