package com.neosoft.poctask.service;

import java.util.List;

import com.neosoft.poctask.model.User;

public interface ServiceI {
	
	List<User> getAllUsers();

	User getUserById(int id);

	User addNewUser(User user);
	
	void deleteUser(int id);


}
