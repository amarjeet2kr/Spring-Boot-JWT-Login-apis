package com.jwt.authentication.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.authentication.models.User;

@Service
public class UserService {
	
	private List<User> users = new ArrayList<>();

	public UserService() {
		users.add(new User(UUID.randomUUID().toString(), "Amarjeet", "amarjeet@gmail.com", "test"));
		users.add(new User(UUID.randomUUID().toString(), "Amarjeet1", "amarjeet1@gmail.com", "test"));
		users.add(new User(UUID.randomUUID().toString(), "Amarjeet2", "amarjeet2@gmail.com", "test"));
		users.add(new User(UUID.randomUUID().toString(), "Amarjeet3", "amarjeet3@gmail.com", "test"));
	}
	
	public List<User> getUsers() {
		return this.users;
	}
	
}
		