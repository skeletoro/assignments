package com.promineotechschool.programmingSchoolApi.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotechschool.programmingSchoolApi.entity.Comment;
import com.promineotechschool.programmingSchoolApi.entity.Post;
import com.promineotechschool.programmingSchoolApi.entity.User;
import com.promineotechschool.programmingSchoolApi.repository.CommentRepository;
import com.promineotechschool.programmingSchoolApi.repository.PostRepository;
import com.promineotechschool.programmingSchoolApi.repository.UserRepository;

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
		throw new Exception("User or Post does not exist.");
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
