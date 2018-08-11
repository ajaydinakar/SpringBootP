package com.ajay.springboot.SimpleRestController.domains;

public class Player {
	String name;
	String role;
	int jerseyNum;
	
	public Player(String name, String role, int jerseyNum) {
		this();
		this.name = name;
		this.role = role;
		this.jerseyNum = jerseyNum;
	}
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getJerseyNum() {
		return jerseyNum;
	}
	public void setJerseyNum(int jerseyNum) {
		this.jerseyNum = jerseyNum;
	}


}
