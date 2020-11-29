package com.nhlhockey.sportsChatApi.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhlhockey.sportsChatApi.entity.Comment;
import com.nhlhockey.sportsChatApi.entity.Post;
import com.nhlhockey.sportsChatApi.entity.User;
import com.nhlhockey.sportsChatApi.respository.CommentRepository;
import com.nhlhockey.sportsChatApi.respository.PostRepository;
import com.nhlhockey.sportsChatApi.respository.UserRepository;


@Service
public class CommentService {

	@Autowired
	private CommentRepository repo;
	
	@Autowired
	private PostRepository postRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	public Comment createComment(Comment comment, Long userId, Long postId) throws Exception {
		User user = userRepo.findOne(userId);
		Post post = postRepo.findOne(postId);
		if (user == null || post == null) {
			throw new Exception("User or Post does not exist");
		}
		comment.setDate(new Date());
		comment.setUser(user);
		comment.setPost(post);
		return repo.save(comment);
	}
	
	
	
	public void deleteComment(Long commentId) {
		repo.delete(commentId);
	}
}
