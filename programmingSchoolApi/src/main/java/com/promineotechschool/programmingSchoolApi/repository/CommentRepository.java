package com.promineotechschool.programmingSchoolApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotechschool.programmingSchoolApi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}
