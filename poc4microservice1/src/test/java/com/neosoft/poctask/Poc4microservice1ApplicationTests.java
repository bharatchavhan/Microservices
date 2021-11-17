package com.neosoft.poctask;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.neosoft.poctask.model.User;
import com.neosoft.poctask.service.ServiceImp;

@SpringBootTest(classes=Poc4microservice1Application.class)
@Import(ServiceImp.class)
@RunWith(SpringRunner.class)
public class Poc4microservice1ApplicationTests {

	
	@Autowired
	public ServiceImp service;
	
	@Test
	public void saveUserTest() {
		User user= new User();
		//List<Bikes> blist= new ArrayList<>();
		user.setAddress("xxxx");
		user.setEmail("aaa@gmail.com");
		user.setId(5);
		user.setName("bharat");
		
		service.addNewUser(user);
		//user.setBlist(blist);
		
		assertEquals(service.getUserById(5), user);
		
	}
	
	@Test
	public void getAllTest() {
		List<User> user = service.getAllUsers();
		assertEquals(user.size(), service.getAllUsers().size());
	}
	
	
	@Test
	public void getsingleTest() {
		User user =service.getUserById(5);
		assertEquals(user.getName(), "bharat");
	}
	
	
	@Test
	public void deleteTest() {
		service.deleteUser(5);
		assertNull(service.getUserById(5));
	}

}
