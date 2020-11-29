package com.nhlhockey.sportsChatApi.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhlhockey.sportsChatApi.entity.Post;
import com.nhlhockey.sportsChatApi.entity.User;
import com.nhlhockey.sportsChatApi.respository.PostRepository;
import com.nhlhockey.sportsChatApi.respository.UserRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	@Autowired
	private UserRepository userRepo;
	
	public Iterable<Post> getAllPost(){
		return repo.findAll();
	}
	public Post getPost(Long id) {
		return repo.findOne(id);
	}
	public Post updatePost(Post post, Long id) throws Exception {
		Post foundPost = repo.findOne(id);
		if (foundPost == null) {
			throw new Exception("Post not found");
		}
		foundPost.setContent(post.getContent());
		return repo.save(foundPost);
	}
	public Post createPost(Post post, Long userId) throws Exception{
		User user = userRepo.findOne(userId);
		if (user == null) {
			throw new Exception("User not found");
		}
		post.setDate(new Date());
		post.setUser(user);
		return repo.save(post);
	}
}
