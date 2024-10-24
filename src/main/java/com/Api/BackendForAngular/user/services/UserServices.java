package com.Api.BackendForAngular.user.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.Api.BackendForAngular.user.User;

@Component
public class UserServices {

	private List<User> users = new ArrayList<User>();
	private int idCount=1;
	
	UserServices(){
		
		users.add(new User(idCount, "Bisham", "Frontend Developer", 23));
		idCount++;
		users.add(new User(idCount, "Hassan", "Frontend Developer", 24));
		idCount++;
		users.add(new User(idCount, "Raheel", "Fullstack Developer", 23));
		idCount++;
		users.add(new User(idCount, "Zaid", "Sales Manager", 26));
	}
	
	public List<User> getAllUser(){
		return this.users;
	}
	
	public Optional<User> getParticularUser(int id){
		Predicate<? super User> predi = user -> user.getId()==id;
		Optional<User> optionalUser= users.stream().filter(predi).findFirst();
		return optionalUser;
	}
	
	public void addUser(User userData) {
		idCount++;
		userData.setId(idCount);
		users.add(userData);
	}
	
	public void deleteUser(int id) {
		Predicate<? super User> predi = user -> user.getId()!=id;
		this.users= users.stream().filter(predi).toList();
	}
	
}
