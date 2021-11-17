package com.neosoft.poctask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.poctask.model.User;
import com.neosoft.poctask.repository.UserRepository;

@Service
public class ServiceImp implements ServiceI {
	
	@Autowired
	UserRepository urepo;

	@Override
	public List<User> getAllUsers() {
		
		return urepo.findAll();
	}

	@Override
	public User getUserById(int id) {
		User u = urepo.getUserById(id);
		return u;
	}

	@Override
	public User addNewUser(User user) {
		User u = urepo.insert(user);
		return u;
	}

	@Override
	public void deleteUser(int id) {
		urepo.deleteUserById(id);
		
	}

	

}
