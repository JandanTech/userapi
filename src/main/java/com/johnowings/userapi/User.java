package com.johnowings.userapi;

public class User {
	private String username;
	private String name;
	private String email;
	
	public User(String newUsername, String newName, String newEmail) {
		username = newUsername;
		name = newName;
		email = newEmail;
	}

	
	
	
	
	
	
	public String getUsername() {		
		return username;
	}
	
	public String getName() {		
		return name;
	}
	
	public String getEmail() {		
		return email;
	}

	public void UpdateName(String newName) {
		name = newName;		
	}	
	
	public void UpdateEmail(String newEmail) {
		email = newEmail;
	}
			
}
