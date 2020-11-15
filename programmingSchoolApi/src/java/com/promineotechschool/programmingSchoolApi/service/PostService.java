package com.promineotechschool.programmingSchoolApi.service;

java .util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotechschool.programmingSchoolApi.entity.Post;
import com.promineotechschool.programmingSchoolApi.entity.User;
import com.promineotechschool.programmingSchoolApi.repository.PostRepository;
import com.promineotechschool.programmingSchoolApi.repository.UserRepository;

@Service
public class PostService {

	
	@Autowired
	private PostRepository repo;
	
	@Autowired 
	private UserRepository userRepo;
	
	public Iterable<Post> getAllPosts(){
		return repo.findAll();
	}
	public Post getPost(Long id) {
		return repo.findOne(id);
	}
	public Post updatePost(Post post, Long id) throws Exception {
		Post foundPost = repo.findOne(id);
		if (foundPost == null) {
			throw new Exception ("Post not found");
		}
		foundPost.setContent(post.getContent());
		return repo.save(foundpost);
	}
	
	public Post createPost(Post post, Long userId) throws Exception {
		User user = userRepo.findOne(userId);
		if (user == null) {
			throw new Exception ("User not found.");
		}
		post.setDate(new date());
		post.setUser(user);
		return repo.save(post);
	}
}
