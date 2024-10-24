package com.Api.BackendForAngular.user;

public class User {
	
	private int id;
	private String name;
	private String proffesion;
	private int age;
	



	public User(int id, String name, String proffesion, int age) {
		super();
		this.id = id;
		this.name = name;
		this.proffesion = proffesion;
		this.age = age;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getProffesion() {
		return proffesion;
	}


	public void setProffesion(String proffesion) {
		this.proffesion = proffesion;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

}
