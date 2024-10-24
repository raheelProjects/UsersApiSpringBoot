package com.Api.BackendForAngular.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Api.BackendForAngular.user.User;
import com.Api.BackendForAngular.user.services.UserServices;

@CrossOrigin
@RestController
public class UserController {
	
	@Autowired
	private UserServices userService;
	
	@GetMapping("/users")
	List<User> getUsers() {
		return userService.getAllUser();
	}

	@PostMapping("/users")
	void adduser(@RequestBody User userData) {
		userService.addUser(userData);
	}
	
	@GetMapping("/users/{id}")
	User getuser(@PathVariable int id) {
		Optional<User> gotUser = userService.getParticularUser(id);
		if(gotUser.isEmpty()) {
			throw new RuntimeException("user not found");
		}
		return gotUser.get();
	}
	
	@DeleteMapping("/users/{id}")
	void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}

}
