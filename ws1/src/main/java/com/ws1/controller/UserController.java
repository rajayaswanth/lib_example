package com.ws1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.lib.dto.User;
import com.ws1.client.UserOperationsClient;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserOperationsClient userClient;
	
	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return userClient.createuser(user);
	}

}
