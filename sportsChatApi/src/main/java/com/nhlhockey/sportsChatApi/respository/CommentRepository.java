package com.nhlhockey.sportsChatApi.respository;

import org.springframework.data.repository.CrudRepository;

import com.nhlhockey.sportsChatApi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}
