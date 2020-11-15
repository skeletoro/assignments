package com.promineotechschool.programmingSchoolApi.view;

import java.util.Set;

import com.promineotechschool.programmingSchoolApi.entity.User;

public class Following {
	private Set<User> following;
	
	public Following(User user) {
		following = user.getFollowing();
	}
public SetL<User> GetFollowing() {
	return following;
}
public void setFollowing(Set<User> following) {
	this.following = following;
}
}
