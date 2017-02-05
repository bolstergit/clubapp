package com.bolster.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bolster.model.User;

@Service("userService")
public class UserService {

	public List<User> getAllUsers(){
		
		List<User> users = new ArrayList<>();
		
		User user1 = new User();
		user1.setFirstname("Joe");
		user1.setLastname("john");
		user1.setDob("12-12-2015");
		user1.setEmail("joe@teleapps.com.au");
		

		User user2 = new User();
		user2.setFirstname("Matt");
		user2.setLastname("franc");
		user2.setDob("26-4-2014");
		user2.setEmail("matt@teleapps.com.au");
		

		User user3 = new User();
		user3.setFirstname("Tom");
		user3.setLastname("Jacob");
		user3.setDob("13-9-1995");
		user3.setEmail("tom@teleapps.com.au");
		
		

		User user4 = new User();
		user4.setFirstname("Zach");
		user4.setLastname("McDon");
		user4.setDob("3-3-2003");
		user4.setEmail("zach@teleapps.com.au");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		return users;
		
	}
}
