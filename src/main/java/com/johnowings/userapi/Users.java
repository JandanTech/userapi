package com.johnowings.userapi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Users {
	private static List<User> UserList = new ArrayList<User>();
	
	
	public static void AddUser(User user) {
		UserList.add(user);
	}
	
	public static User FindUser(String username) {
        for (Iterator<User> iterator = UserList.iterator(); iterator.hasNext();) {
        	User user = iterator.next();
        	if (user.getUsername() == username ) {
        		return user;
        	}
        }
        return null;
	}
	
	public static void RemoveUser(String username) {
        for (Iterator<User> iterator = UserList.iterator(); iterator.hasNext();) {
        	User user = iterator.next();
        	if (user.getUsername() == username ) {
        		UserList.remove(user);
        		return;
        	}
        }
	}	
			
}
