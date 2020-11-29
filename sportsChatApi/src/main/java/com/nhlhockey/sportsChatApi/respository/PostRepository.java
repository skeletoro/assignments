package com.nhlhockey.sportsChatApi.respository;

import org.springframework.data.repository.CrudRepository;

import com.nhlhockey.sportsChatApi.entity.Post;

public interface PostRepository extends CrudRepository <Post, Long> {

}
