package com.user.lib.client;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.user.lib.dto.User;

public class UserClient {
	
	public User createUser(User user) {
		RestTemplate template = new RestTemplate();
		RequestEntity<User> request = null;
		try {
			request = RequestEntity
				     .post(new URI("http://localhost:8081/user/create"))
				     .accept(MediaType.APPLICATION_JSON)
				     .body(user);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		ResponseEntity<User> response = template.exchange(request, User.class);

		return response.getBody();
	}

}
