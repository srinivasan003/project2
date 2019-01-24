package com.niit.dao;

import java.util.List;

import com.niit.model.Friends;
import com.niit.model.User;

public interface FriendDao {
	List<User> getAllSuggestedUsers(String email);
	void friendRequest(Friends friend);
	List<Friends> pendingRequests(String email);
	void acceptFriendRequest(Friends friend);
	void deleteFriendRequest(Friends friend);
	List<User> listOfFriends(String email);

}
