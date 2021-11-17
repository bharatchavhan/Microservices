package com.neosoft.poctask.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.neosoft.poctask.model.User;
import com.neosoft.poctask.service.ServiceI;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private ServiceI si;
	
//	@Autowired
//	FeignService feignservice;
//	
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User u)
	{
		User user= si.addNewUser(u);
		return user;
	}
	
	@GetMapping("/getAll")
	public List<User> getAllUser()
	{
		return si.getAllUsers();
	}
	
	@GetMapping("/getSingle/{id}")
	public User getById(@PathVariable int id)
	{
		User u= si.getUserById(id);
		
	List book=	restTemplate.getForObject("http://BIKESERVICE/bike/getAllBike/"+u.getId(),List.class);
	//List book=feignservice.getAllBikesByUserId(u.getId());
	u.setBlist(book);
	return u;
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public String deleteUser(@PathVariable int id)
	{
		si.deleteUser(id);
		return "user deleted";
	}
	

	

}
