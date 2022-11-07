package com.ws1.client;

import org.springframework.stereotype.Service;

import com.user.lib.client.UserClient;
import com.user.lib.dto.User;

@Service
public class UserOperationsClient {
	
	UserClient client = new UserClient();
	
	public User createuser(User user) {
		return client.createUser(user);
	}
	
}
