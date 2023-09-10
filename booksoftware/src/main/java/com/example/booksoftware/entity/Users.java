package com.example.booksoftware.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name="Users")
public class Users 
{
	
	@Column(name="username")
	private String Username;
	
	@Column(name="password")
	private String Password;

	public Users() {
		super();
	}

	public Users(String userName, String password) {
		super();
		Username = userName;
		Password = password;
	}

	public String getUserName() {
		return Username;
	}

	public void setUserName(String userName) {
		Username = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	
	

}
