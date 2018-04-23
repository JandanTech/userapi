package com.johnowings.userapi;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class UserapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserapiApplication.class, args);
	}
	
    @RequestMapping("/addUser")
    @ResponseBody    
    public static User AddUser(@RequestParam(value="username") String newUsername,@RequestParam(value="name") String newName,@RequestParam(value="email") String newEmail) {
    	User newUser = new User(newUsername, newName, newEmail);
    	
    	Users.AddUser(newUser);
    	return newUser;
    }
    
    @RequestMapping("/removeUser")
    @ResponseBody    
    public static void removeUser(@RequestParam(value="username") String username) { 	    	
    	Users.RemoveUser(username);    	
    }    
    
    @RequestMapping("/findUser")
    @ResponseBody    
    public static User findUser(@RequestParam(value="username") String username) {
    	return Users.FindUser(username);	
    }
    
    
    @RequestMapping("/updateName")
    @ResponseBody    
    public static User updateName(@RequestParam(value="username") String username, @RequestParam(value="newNaame") String newName) {
    	User user = Users.FindUser(username);
    	user.UpdateName(newName);
    	return user;
    }
    
    
    @RequestMapping("/updateEmail")
    @ResponseBody    
    public static User updateEmail(@RequestParam(value="username") String username, @RequestParam(value="newEmail") String newEmail) {
    	User user = Users.FindUser(username);
    	user.UpdateEmail(newEmail);
    	return user;
    }          
}
